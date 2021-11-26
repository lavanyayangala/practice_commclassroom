package com.lavs;

import java.util.Scanner;

public class Loops {
    public static void main(String [] args){

        /*
        syntax for loop
        for(intitialisation;condition;increment/decrement){
        //body
        }
         */
        //        print numbers from 1 to 5
//        for (int i = 1; i <=5 ; i++) {
//            System.out.println(i);
//        }
//        print numbers from 1 to n
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i = 0; i <n ; i++) {
//            System.out.println("num");
        int hello = input.nextInt();
        for (int i=0;i<=hello;i++){
            System.out.println("hi");

        }
    }
}
