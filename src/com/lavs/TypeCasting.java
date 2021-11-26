package com.lavs;


import java.util.Scanner;

public class TypeCasting {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
//        float num = input.nextFloat();
//        int num =input.nextInt();
//        double num = input.nextDouble();

//        this is type casting;--compressing bigger to smaller explicitly.

//        int num =(int)(99.89f);
//        System.out.println(num);


//        automatic type promotion in expressions

        int f = 257;
        byte a =40;
        byte b=50;
        byte c= 100;
        int d =(a*b)/c;
        System.out.println(f);
        System.out.println(d);
        int alpha = 'L';
        System.out.println(alpha);



    }
}