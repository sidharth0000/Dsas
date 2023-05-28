package com.example.lib.dataStructure.arraylist;

import com.example.lib.Employee;

import java.util.ArrayList;

public class ArrayLi {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Sid","Pry",1));
        arrayList.add(new Employee("hi","hlo",2));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));


    }
}
