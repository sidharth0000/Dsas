package com.example.lib.dsa.collections;

import com.example.lib.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {
    public static  void operations(){
        LinkedList<Employee> employees =new LinkedList<>();
        //this add method add item to the end of list means at tail
        employees.add(new Employee("hii","hlo",1));
        employees.add(new Employee("hii2","hlo",2));
        employees.add(new Employee("hii3","hlo",3));
        employees.add(new Employee("hii4","hlo",4));

        //this addFirst method add item to the starting of the list means at head
        employees.addFirst(new Employee("hlo","dkd",6));

       int i= employees.indexOf(new Employee("hlo","dkd",6));
        System.out.println(i);


        Iterator iterator = employees.iterator();

        System.out.print("Head ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<->");
        }
        System.out.print("null");



       /* for (Employee e:employees
             ) {
            System.out.println(e);

        }*/



    }
}
