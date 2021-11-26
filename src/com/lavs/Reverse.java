package com.lavs;

public class Reverse {
    public static void main(String[] args) {
        int num;
        num =1686;
        int sum=0;
        int result;
        while (num!=0){
            result = num%10;
            sum = sum*10+result;
            num =num/10;

        }
        System.out.println(sum);

    }
}
