package com.example.lib.practices;

import java.util.Scanner;

public class Sort012 {
    public void sort012(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out[] = new int[n];
        sc.nextLine();
        String str[] = sc.nextLine().trim().split(" ");
        int e[] = new int[3];
        for (int m = 0; m < n; m++) {
            if (Integer.parseInt(str[m]) == 0) {
                e[0]++;
            } else if (Integer.parseInt(str[m]) == 1) {
                e[1]++;
            } else if (Integer.parseInt(str[m]) == 2) {
                e[2]++;
            }
        }

        int i=0;
        int j=0;
        int k=0;
        for (i = 0,j = e[0]-1,  k = e[1]+e[0] - 1;i < e[0] || j < e[1]+e[0] || k<n;
             i++, j++,k++){
            if(i<e[0]){
                if(i==-1){
                    i=0;
                }
                out[i]=0;
            }
            if (j<e[1]+e[0]){
                if(j==-1){
                    j=0;
                }
                out[j]=1;
            }
            if (k<n) {
                if(k==-1){
                    k=0;
                }
                out[k]=2;
            }
        }


        for (int nm=0;nm<n;nm++) {
            System.out.print(out[nm]+" ");


        }
        System.out.println("");

    }
}
