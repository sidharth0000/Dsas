package com.example.lib.dsa.preComputation;

import java.util.Scanner;

public class PrefixSum {
    /*Given •array •a •of •N • integers. Given Q queries
    and in each query given L and R print sum of
    array elemnts from index L to R(L, R included)
    Constraints
    1<=N<=10^5
    1<=a[1]<=10^9
     1<=Q<=10^5
    1<=L,R<=N
    */
    public static void sumOfArrayInSpecificIntervel(int[] arr) {
        int N = (int) Math.pow(10, 5) + 100;
        int[] bArr = new int[N];
        int sum = 0;
        for (int i = 1; i <= arr.length; i++) {
            sum += arr[i - 1];
            bArr[i] = sum;

        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String[] str = sc.nextLine().trim().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            if (end < start) {
                System.out.println("Wrong input");
            }

            System.out.println("Sum: " + (bArr[end] - bArr[start - 1]));
        }


    }


    public static void simpleSolution() {
   /* Given 2d array a of integers. Given Q
    queries and in each query given a, b, c and d
    print sum of square represented by (a, b) as
    top left point and' (c,d) •as • •bottom• right'
    pointl
    Constraints
    1<=N<=10^3
    1<=a[i]b[j]<=10^9
     1<=Q<=10^5
    1<=a,b,c,d<=N

*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().trim().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int t =sc.nextInt();
        sc.nextLine();
        while (t-->0){

            String[] s = sc.nextLine().trim().split(" ");
            int ff=Integer.parseInt(s[0]);
            int fs=Integer.parseInt(s[1]);
            int sf=Integer.parseInt(s[2]);
            int ss = Integer.parseInt(s[3]);

            int sum=0;

            for(int p =ff-1;p<sf;p++){
                for(int q = fs-1;q<ss;q++){
                    sum+=arr[p][q];

                }
            }

            System.out.println("Sum: "+sum);


        }




    }

    public static  void solutionUsingPrefixSumOf2DArray(){
        /* Given 2d array a of integers. Given Q
    queries and in each query given a, b, c and d
    print sum of square represented by (a, b) as
    top left point and' (c,d) •as • •bottom• right'
    pointl
    Constraints
    1<=N<=10^3
    1<=a[i]b[j]<=10^9
     1<=Q<=10^5
    1<=a,b,c,d<=N

*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int N =(int)Math.pow(10,3)+100;
        int[][] allSum =new int[N][N];



        int[][] arr = new int[n][n];
        for (int i = 1; i <= n; i++) {
            String[] str = sc.nextLine().trim().split(" ");
            for (int j = 1; j <= n; j++) {

                arr[i-1][j-1] = Integer.parseInt(str[j-1]);
                //take a look
                allSum[i][j]=arr[i-1][j-1]+allSum[i-1][j]+allSum[i][j-1]-allSum[i-1][j-1];
               // System.out.print(allSum[i][j]+" ");
            }
            //System.out.println("");
        }


        int t =sc.nextInt();
        sc.nextLine();
        while (t-->0) {

            String[] s = sc.nextLine().trim().split(" ");
            int ff=Integer.parseInt(s[0]);
            int fs=Integer.parseInt(s[1]);
            int sf=Integer.parseInt(s[2]);
            int ss = Integer.parseInt(s[3]);

            //take a look
            System.out.println(allSum[sf][ss]-allSum[ff-1][ss]-allSum[sf][fs-1]+allSum[ff-1][fs-1]);




        }
        }


}
