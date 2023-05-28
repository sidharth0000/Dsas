package com.example.lib.practices;

import java.util.ArrayList;

public class TwentyFour {
    public  static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {

        ArrayList<Integer> arrayList=new ArrayList<>();
        //this is good solution for only positive integer
       /* int N=(int)Math.pow(10,5);
        int arr[]=new int[N];
        for(int i=0;i<n1;i++){
            if(arr[A[i]]<1){
            arr[A[i]]++;
            }
        }
        for(int j=0;j<n2;j++){
             if(arr[B[j]]<2){
            arr[B[j]]++;
             }
        }

        for(int k=0;k<n3;k++){
             if(arr[C[k]]<3){
            arr[C[k]]++;
            if(arr[C[k]]==3){
                arrayList.add(C[k]);
            }
             }


        }*/



        for(int i =0;i<n1;i++){
            int count=1;
            for(int j=0;j<n2;j++){
                if(A[i]==B[j]){
                    count++;
                    break;
                }

            }

            for(int k=0;k<n3;k++){
                if(A[i]==C[k]){
                    count++;
                    break;
                }
            }

            if(count==3){
                for(int h=0;h<arrayList.size();h++){
                    if(A[i]==arrayList.get(h)){
                        arrayList.remove(h);
                        break;

                    }
                }
                arrayList.add(A[i]);

            }

        }




        return arrayList;

    }
}
