package com.example.lib.dsa.recursion;

public class DigitSum {
    public static int digitSum(int n){
        if(n<=0) return 0;
        int last_digit=n%10;
        int num = n/10;
        return digitSum(num)+last_digit;

    }
}
