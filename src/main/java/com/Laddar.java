package com;

public class Laddar {
    public static void main(String[] args) {
        try {
            doStuff("X");
        } catch (Exception e) {
            System.out.println("Exec");
        }
        doStuff("X");
    }

    static int doStuff(String x) {
        return Integer.parseInt(x);
    }
}
