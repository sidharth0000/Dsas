package com.example.lib.dsa.sorting;

public class BubbleSort {
    public static void sort(int[] arr){
        int unsorted_arr_index=arr.length;

       while (unsorted_arr_index>0){
            int k=0;
            for (int j=0;j<unsorted_arr_index;j++){
                if (arr[k]>arr[j]){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
                    k=j;
            }

            unsorted_arr_index--;

        }

        for (int m=0;m<arr.length;m++){
            System.out.print(arr[m]+" ");
        }
        System.out.println("");


    }


}
