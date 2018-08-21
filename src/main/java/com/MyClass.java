package com;

public class MyClass {
    public void writeValue(int a, byte b) {

        System.out.println("Byte " + a + b);

    }

    public void writeValue(int a, short b) {

        System.out.println("Int " + a + b);

    }

    public void writeValue(int a, Integer b) {

        System.out.println("Integer " + a + b);

    }

    public void writeValue(int a, double b) {

        System.out.println("Double " + a + b);

    }

    public static void main(String[] args) {

        new MyClass().writeValue(2, 5);

    }
}
