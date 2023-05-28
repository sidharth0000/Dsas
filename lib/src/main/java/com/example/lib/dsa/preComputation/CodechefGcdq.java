package com.example.lib.dsa.preComputation;

import java.util.Scanner;

import jdk.jfr.internal.test.WhiteBox;

public class CodechefGcdq {

    public static void Normalgcdq() {

   /* You are given an array A Of integers Of size N, You will be given Q queries where
    each query is represented by two integers L, R. You have to find the gcd(Greatest
    Common Divisor) Of the array after excluding the part from range L to R inclusive
    (1 Based indexing). You are guaranteed that after excluding the part of the array
    remaining array is non empty.

   Input:
    >First line of input contains an integer T denoting number of test cases.
    >For each test case, first line will contain two space separated integers N, Q.
    >Next line contains N space separated integers denoting array A.
    >For next Q lines, each line will contain a query denoted by two space
    separated integers L, R.*/
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {


            String[] gi = sc.nextLine().trim().split(" ");
            int n = Integer.parseInt(gi[0]);
            int q = Integer.parseInt(gi[1]);
            String[] arr = sc.nextLine().trim().split(" ");
            while (q-- > 0) {
                String[] lr = sc.nextLine().trim().split(" ");
                int l = Integer.parseInt(lr[0]);
                int r = Integer.parseInt(lr[1]);
                //gcd of 0 and any number n give n
                int gcd=0;
                /*if (l != 1) {
                    gcd = Integer.parseInt(arr[0]);
                } else {
                    gcd = Integer.parseInt(arr[arr.length - 1]);
                }*/
                for (int i = 0; i < l - 1; i++) {
                    // System.out.println("h");
                    gcd = findGcd(gcd, Integer.parseInt(arr[i]));
                }

                for (int j = r; j < arr.length; j++) {
                    //System.out.println("k "+j);
                    gcd = findGcd(gcd, Integer.parseInt(arr[j]));
                }

                System.out.println(gcd);


            }
        }


    }


    public static void usingPrefixGcdq(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int N = (int)Math.pow(10,5)+100;
        int[] forwardPrefixGcd=new int[N];
        int[] backwardPrefixGcd=new int[N];
        sc.nextLine();
        while (t-- > 0) {


            String[] gi = sc.nextLine().trim().split(" ");
            int n = Integer.parseInt(gi[0]);
            int q = Integer.parseInt(gi[1]);
            String[] arr = sc.nextLine().trim().split(" ");
            for(int i =0;i<n;i++){
                forwardPrefixGcd[i+1]=findGcd(forwardPrefixGcd[i],Integer.parseInt(arr[i]));
             //   System.out.println(forwardPrefixGcd[i+1]+" ="+forwardPrefixGcd[i]+","+Integer.parseInt(arr[i]));
            }


            for(int j =n;j>0;j--){
                backwardPrefixGcd[j]=findGcd(backwardPrefixGcd[j+1],Integer.parseInt(arr[j-1]));
             //   System.out.println(backwardPrefixGcd[j]+" ="+backwardPrefixGcd[j+1]+","+Integer.parseInt(arr[j-1]));

            }
            while (q-- > 0) {
                String[] lr = sc.nextLine().trim().split(" ");
                int l = Integer.parseInt(lr[0]);
                int r = Integer.parseInt(lr[1]);
                System.out.println(findGcd(forwardPrefixGcd[l-1],backwardPrefixGcd[r+1]));
               // System.out.println((forwardPrefixGcd[l-1] +", "+backwardPrefixGcd[r+1]));

            }



        }

    }


    private static int findGcd(int a, int b) {
        if(a==0){
            return b;
        }
        if (b==0){
            return a;
        }
        int current_gcd = 1;
        for (int i = 1; i <= a; i++) {
            if (i > b) {
                return current_gcd;
            }
            if (a % i == 0 && b % i == 0) {
                if (i > current_gcd) {
                    current_gcd = i;
                }
            }
        }
        return current_gcd;
    }
}
