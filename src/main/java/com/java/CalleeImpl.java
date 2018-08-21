package com.java;

public class CalleeImpl implements Callee {
    @Override
    public void foo(Object o) {
        System.out.println("foo(Object) = " + o);
    }

    @Override
    public void foo(String s) {
        System.out.println("foo(String = " + s);
    }

    @Override
    public void foo(Integer integer) {
        System.out.println("foo(Integer) = " + integer);
    }

    public static void main(String[] args) {
        Object i = new Integer(2);
        Object s = new String("test");
        Object o = new Object();

        Callee callee = new CalleeImpl();
        callee.foo(i);
        callee.foo(s);
        callee.foo(o);

    }
}
