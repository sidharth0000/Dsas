package com.example.lib.dsa.recursion;

public class ArraySum {
    public static   int sum(int i,int arr[]){
        if(i<0) return 0;
        int s=sum(i-1,arr);
        return s+arr[i];
    }
}
