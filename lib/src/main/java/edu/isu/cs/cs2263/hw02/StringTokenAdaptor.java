package edu.isu.cs.cs2263.hw02;

import java.util.StringTokenizer;

public class StringTokenAdaptor implements PushbackTokenizer {
    private StringTokenizer tokenizer;
    private String string;

    public StringTokenAdaptor(String string) {
        tokenizer = new StringTokenizer(string);
        this.string = string;
    }


    @Override
    public String nextToken() {
        return tokenizer.nextToken();

    }

    @Override
    public boolean hasMoreTokens() {
        return tokenizer.hasMoreTokens();
    }

    @Override
    public void pushback() {
        int indexPoint = tokenizer.countTokens() + 1;
        tokenizer = new StringTokenizer(string);//reset's tokenizer
        for (int x = tokenizer.countTokens(); x != indexPoint; x--) {
            if (tokenizer.hasMoreTokens()) {//doesn't push back if already at the beginning.
                tokenizer.nextToken();
            } else {
                break;
            }
        }
    }
}
