package com.example.lib.dsa.preComputation;

import java.util.Scanner;

public class Hashing {
    /* Given T Test cases and in each test case a number N.
    * print Its factorial for each test cases %M where M=10^9+7;
    * Constrains:
    * 1<=T<=10^5
    * 1<=N<=10^5
    * time 1s
    * */

    static int M = (int) (Math.pow(10,7)+7);
    static int N=(int)Math.pow(10,5)+100;
    //simple method
    public static int simple(int T){
        Scanner sc=new Scanner(System.in);

        int fact=1;
        while(T-->0) {
            int n=sc.nextInt();

            for (int i = 2; i <=n;i++){
                fact=(fact*i)%M;

            }

        }
        return fact;
        //time complexity =O(T*N)=O(N^2)=10^5*10^5=10^10
        //so here all things good but tle occurs
    }

    public static int precomputationMethod(int T){
        int arr[]=new int[N];
        arr[0]=1;
        arr[1]=1;
        Scanner sc=new Scanner(System.in);
        for(int i=2;i<N;i++){
            arr[i]=(arr[i-1]*i)%M;
        }
        int fact=1;
        while (T-->0){
            int n=sc.nextInt();
            fact=arr[n];
        }

        return fact;
        //here we decrease time Complesity by 10^5 this will easily executed in 1 sec
    }

}
