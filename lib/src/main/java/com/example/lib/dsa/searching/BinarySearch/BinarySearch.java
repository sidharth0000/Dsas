package com.example.lib.dsa.searching.BinarySearch;

public class BinarySearch {
    public static int search(int[] arr,int element){
        int low=0,high=arr.length-1;
        int mid=(low+high)/2;
        while (low<=high){
            if (arr[mid]==element){
                return mid;
            }
            if (arr[mid]>element){
                high=mid-1;

            }else {
                low=mid+1;

            }
            mid=(low+high)/2;

        }

        return -1;

    }

    public static int moreEfficientSearch(int[] arr, int element){


        int low=0,high=arr.length-1,mid;
        while (high-low>1){
            mid=(high+low)/2;
            if (arr[mid]<element){
                low=mid+1;
            }else {
                //because here also you have to consider mid value
                high=mid;
            }
        }

        if (arr[low]==element){
            return low;
        }else if (arr[high]==element){
            return high;
        }else {
            return -1;
        }


    }
}
