package com.example.lib.dsa.searching.BinarySearch;

public class LowerUpperBound {
    public static int lower_bound(int[] arr,int element){
        int low=0,high=arr.length-1,mid;
        if (arr[arr.length-1]<element){
            return -1;
        }
        if (arr[0]>element){
            return 0;
        }
        while (high-low>1){
            mid=(high+low)/2;
            if (arr[mid]<element){
                low=mid+1;
            }else {
                high=mid;
            }

        }
        if (arr[low]==element){
            return low;
        }else if (arr[high]==element){
            return high;
        }else {
            return high;

        }



    }

  /*  public static int upper_bound(int[] arr,int element){
        int low=0,high=arr.length-1,mid;
        while (high-low>1){
            mid=(high+low)/2;
            if (arr[mid]>element){
                high=mid-1;
            }else {
                low=mid;
            }


        }
        if (arr[high]==element){
            return high+1;
        }else {

        }
    }*/
}
