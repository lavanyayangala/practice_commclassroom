package com.lavs;

import java.util.Scanner;

public class Character {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
//        int ASCII = 'A';
//        System.out.println("ɡo͝od ˈmôrniNG");
//        type promotion rules
//        System.out.println(5*6);
        byte b =42;
        char c ='a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) -(d-s);
//        float +int-double=double

        System.out.println((f*b) + " " + (i/c) + "" + (d-s));
        System.out.println(result);

    }
}
