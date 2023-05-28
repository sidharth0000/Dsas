package com.example.lib;

import com.example.lib.dsa.searching.BinarySearch.BinarySearch;
import com.example.lib.dsa.searching.BinarySearch.LowerUpperBound;
import com.example.lib.dsa.searching.BinarySearch.SquareRoot;

import java.util.ArrayList;

public class Main {
    static int i=0;



    public static void main(String[] args) {


       /* Employee e1= new Employee("Sidharth","Priyadarshi",1);
        Employee e2= new Employee("Arth","Priyadarshi",2);
        Employee e3= new Employee("Sid","Priyadarshi",3);
        Employee e4= new Employee("Nags","hii",4);
        Employee e5= new Employee("Nugs","Priyadarshi",5);
        Employee e6= new Employee("Hii","Haa",6);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("sid",e1);
        hashTable.printHashTable();
        hashTable.get("sid");
        hashTable.remove("sid");
        hashTable.printHashTable();

*/

      /*  for (String e:GenerateParentheses.generate("",3,3)
             ) {
            System.out.println(e);
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
    SubsetCreations.generate(arrayList,0,new int[]{1,2,3});

*/


        System.out.println(SquareRoot.squareRoot(1024));







    }

    public  ArrayList<ArrayList<Integer>> generate(ArrayList<Integer> subset, int i, int set[],ArrayList<ArrayList<Integer>> arrayList){


        if(i==set.length){

            arrayList.add(subset);
            return arrayList;
        }

        generate(subset,i+1,set,arrayList);

        subset.add(set[i]);
        generate(subset,i+1,set,arrayList);
        subset.remove(subset.size()-1);

        return arrayList;


    }





}
