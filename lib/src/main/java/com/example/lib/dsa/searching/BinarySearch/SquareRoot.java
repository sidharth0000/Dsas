package com.example.lib.dsa.searching.BinarySearch;

public class SquareRoot {
    public static int squareRoot(int element){
        int l=0,h=element-1,mid;
        while (h-l>1){
            mid=(h+l)/2;
            if((mid+1)*(mid+1)<element){
                l=mid+1;
            }else {
                h=mid;
            }
        }
        if((l+1)*(l+1)==element){
            return l+1;
        }else if ((h+1)*(h+1)==element){
            return h+1;
        }else{
            return -1;
        }

    }
}
