package com.lavs;

import java.util.Scanner;

public class Inputs {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter roll num:");
        int Rollno =input.nextInt();
        System.out.println("this is my roll number"+Rollno);

//literals and identifiers
//        literals are syntax representation

        int a;
        a = 2_345_000_00;
        System.out.println(a);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
