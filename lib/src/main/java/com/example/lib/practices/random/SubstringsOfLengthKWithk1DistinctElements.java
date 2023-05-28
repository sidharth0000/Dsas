package com.example.lib.practices.random;

public class SubstringsOfLengthKWithk1DistinctElements {
    public static int countOfSubstrings(String S, int K) {
        boolean is_still=false;
        int count=0;

            for (int j=0;j<K+j;j++){

                if (K+j>S.length()){
                    break;
                }
               // System.out.println(S.substring(j,K+j));
                for (int i=j;i<j+K;i++){
                   // System.out.println(S.charAt(j)+"="+S.charAt(i + 1));

            }

                if (is_still){
                    count++;
                }


        }
            return count;
    }
}
