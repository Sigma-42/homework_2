package edu.isu.cs.cs2263.hw02;
public class Driver {

    public static void main(String[] args){

        String test = "This is a simple test.";
        StringTokenAdaptor t = new StringTokenAdaptor(test);
        while(t.hasMoreTokens()){
            System.out.println(t.nextToken());
        }
        t.pushback();
        System.out.println(t.nextToken());
        t.pushback();
        t.pushback();
        System.out.println(t.nextToken());
        t.pushback();
        t.pushback();
        System.out.println(t.nextToken());






    }
}
