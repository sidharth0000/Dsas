package com.example.lib.practices;

public class PairSumIsEqualToGivenNumber {
   public static int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]==k){
                    //System.out.println(arr[i]+", "+arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
