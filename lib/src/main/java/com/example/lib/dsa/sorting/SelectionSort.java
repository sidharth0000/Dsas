package com.example.lib.dsa.sorting;

public class SelectionSort {

    public static void sort(int[] arr){

        int unsorted_partition=arr.length;
        while (unsorted_partition>0){
            int k=0;
            int max=arr[k];

            for (int i=0;i<unsorted_partition;i++){
                if (arr[i]>max){
                    max=arr[i];
                    k=i;

                }

            }
            int temp = arr[unsorted_partition-1];
            arr[unsorted_partition-1]=max;
            arr[k]=temp;



            unsorted_partition--;
        }

        for (int e:arr
             ) {
            System.out.print(e+" ");
        }
        System.out.println("");


    }
}
