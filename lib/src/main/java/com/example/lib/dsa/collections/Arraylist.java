package com.example.lib.dsa.collections;

import java.util.ArrayList;

public class Arraylist {
    public static void normalOperation(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(34);
       boolean is_present= arrayList.contains(34);
        for (int a:arrayList
             ) {
            System.out.print(a+" ");
        }
       int index= arrayList.indexOf(34);
       int n= arrayList.size();
       boolean is_empty=arrayList.isEmpty();
       //replace an item
       arrayList.set(0,36);
       arrayList.add(2,56);
       arrayList.remove(34);




    }
}
