package com.example.test;

public class MyClass {
    public static int func(int a,int b){
        int x = a * b;
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Hello Pknatic!!");
        int a = 6 ;
        int b = 7;
        int c;
        c = func(a,b);
        System.out.println(c);
    }
}