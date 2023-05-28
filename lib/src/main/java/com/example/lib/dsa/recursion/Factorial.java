package com.example.lib.dsa.recursion;

public class Factorial {
    public static int factorial(int n){
        if(n==0) return 1;
        return factorial(n-1)*n;

    }
}
