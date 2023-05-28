package com.example.lib.practices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        StringBuffer s = new StringBuffer();
        for(int i=0;i<nums.length;i++){

            s.append(nums[i]);

        }

        int small=Integer.parseInt(s.toString());

       Arrays.sort(nums);
        StringBuffer s2 = new StringBuffer();
        for(int j=0;j<nums.length;j++){

            s2.append(nums[(nums.length-1)-j]);

        }

        int big=Integer.parseInt(s2.toString());

        if(small==big){
            Arrays.sort(nums);
            for (int e:nums
            ) {
                System.out.print(e+" ");
            }
            return;
        }
       // System.out.println(small+" "+big);


        int output=-1;
        for(int k=small+1;k<big+1;k++){
            if(isAllDigitPresent(k,s.toString())){
                output=k;
                break;
            }
        }

        int out[]= new int[nums.length];
        int g=nums.length-1;
        for(int h=output;h>0;h/=10){
            out[g--]=h%10;
        }


        nums=out.clone();

        for (int e:nums
             ) {
            System.out.print(e+" ");
        }






    }

    private static boolean isAllDigitPresent(int k,String small) {
        boolean is_present_till=false;
        int count[]=new int[101];
        for (int i=0;i<small.length();i++) {
            int num = Integer.parseInt(small.substring(i, i+1));
            count[num]++;
            if (num==0){
                continue;
            }else {


                int cc=0;
                for (int m = k; m>0;m/=10){
                    if(num==m%10){
                        cc++;
                        if(cc==count[num]) {
                            is_present_till = true;
                            break;
                        }


                    }
                    is_present_till=false;
                }

            }
            if(!is_present_till){
                return  false;
            }

        }

        return true;

    }

}
