package com.example.lib.practices;

public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        /*int min = prices[0],min_index=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min= prices[i];
                min_index=i;

            }
        }
        if(min_index==prices.length-1){
            return 0;
        }
        int max=min;
        for(int j=min_index;j<prices.length;j++){
            if(prices[j]>max){
                max=prices[j];
            }
        }


        return max-min;*/


        int max =0,min_value=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_value){
                min_value=prices[i];
            }else if(prices[i]-min_value>max){
                max=prices[i]-min_value;
            }
        }


        return max;



    }

}
