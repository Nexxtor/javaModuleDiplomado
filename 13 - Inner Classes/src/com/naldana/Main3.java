package com.naldana;

class OuterClass3 {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class Main3 {
    public static void main(String[] args) {
        OuterClass3.InnerClass myInner = new OuterClass3.InnerClass();
        System.out.println(myInner.y);
    }
}