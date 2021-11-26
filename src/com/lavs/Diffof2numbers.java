package com.lavs;

import java.util.Scanner;

public class Diffof2numbers {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 =input.nextInt();
        int diff =num1-num2;
        System.out.println("diff of 2 numbers is : "+diff);
    }
}
