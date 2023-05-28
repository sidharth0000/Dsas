package com.example.lib.contest.contenst90;

import java.util.Scanner;

public class Second {
    public static void second(){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();

            if(n%2==0 && n%7==0){
                System.out.println("Alice");


            }else if (n%2!=0 && n%9==0){
                System.out.println("Bob");

            }else{
                System.out.println("Charlie");

            }

        }

    }
}
