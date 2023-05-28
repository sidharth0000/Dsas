package com.example.lib.dsa.recursion.advanceRecursion;

import java.util.ArrayList;

public class SubsetCreations {

    public static void generate(ArrayList<Integer> subset, int i, int[] set){
        if(i==set.length){
            System.out.print("[");
            for (Integer e:subset
                 ) {
                System.out.print(e+" ");
            }
            System.out.print("]");

            System.out.println("");
            return ;
        }


        generate(subset,i+1,set);




        subset.add(set[i]);
        generate(subset,i+1,set);
        subset.remove(subset.size()-1);


    }

}
