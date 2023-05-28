package com.example.lib.dsa.preComputation;

import java.util.Scanner;

public class SubStringPalindrome {
   public static void isSubstringPalindrome(){


        int[] alphaCount=new int[200];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().trim();
        int q = sc.nextInt();
        sc.nextLine();
        while (q-->0){
            String[] rStr=sc.nextLine().trim().split(" ");
            int start =Integer.parseInt(rStr[0]);
            int end =Integer.parseInt(rStr[1]);

            StringBuilder mainStrb= new StringBuilder();
            for (int i=start-1;i<end;i++){
                mainStrb.append(str.charAt(i));

            }

            String mainStr=mainStrb.toString();
            System.out.println(mainStr);

            for (int j=0;j<mainStr.length();j++){
                alphaCount[(int)mainStr.charAt(j)]++;

            }
            boolean is_still_palindrome=false;
            int count=0;
            for (int k=0;k<mainStr.length();k++){
                if (alphaCount[(int)mainStr.charAt(k)]%2==0){
                    is_still_palindrome=true;
                }else {
                    count++;
                    if (count>1){
                        is_still_palindrome=false;
                        break;

                    }else {
                        is_still_palindrome=true;
                    }

                }

            }

           System.out.println(is_still_palindrome?"Yes":"NO");



        }



    }
}
