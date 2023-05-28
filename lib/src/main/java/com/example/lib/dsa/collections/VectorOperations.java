package com.example.lib.dsa.collections;

import java.util.List;
import java.util.Vector;

public class VectorOperations {

    public static void operations() {
        //vector and arraylist is almost same but:
        //Vector is synchronized or thread safe means only one thread can access data at a time
        //if you want thread safety use vector,if not then use arraylist because Vector is slower than arraylist becoz of synchronized overhead
        //vector increase 100% size if arraylist is full whereas arraylist increase 50% of total size
        //rest all methods are same

        List<Integer> integerList = new Vector<>();
        integerList.add(23);
        integerList.add(55);
        boolean is_present = integerList.contains(23);
        int i =integerList.indexOf(34);
        int ii=integerList.get(1);



    }
}
