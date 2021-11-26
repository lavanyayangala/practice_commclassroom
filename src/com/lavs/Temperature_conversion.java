package com.lavs;

import java.util.Scanner;

public class Temperature_conversion {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter temperature in c:");

        float tempC = input.nextFloat();
//celsius to fahrenheit
        float tempF =(tempC *9/5)+32;

        System.out.println(tempF);
    }
}
