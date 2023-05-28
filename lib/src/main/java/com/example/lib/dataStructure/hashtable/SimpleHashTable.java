package com.example.lib.dataStructure.hashtable;

import com.example.lib.Employee;

public class SimpleHashTable {
    private Employee employees[];

    public SimpleHashTable() {
        this.employees = new Employee[10];
    }

    public void put(String key,Employee employee){
        int hashKey = hashKey(key);
        int stopKey=hashKey;
        if(employees[hashKey]!=null){
            if(hashKey==employees.length-1){
                hashKey=0;

            } else {
                hashKey++;
            }

            while (employees[hashKey]!=null && hashKey!=stopKey){
              hashKey=  (hashKey+1)%employees.length;
            }

        }


        if (employees[hashKey]!=null){
            System.out.println("This position has already occupied by another employee");

        }else {
            employees[hashKey]=employee;
        }


    }

    public void remove(String key){
        int hashKey= hashKey(key);
        if(employees[hashKey]==null){
            System.out.println("Employee not exist");

        }else{
            employees[hashKey]=null;
            System.out.println("Employee has been removed successfully");


        }
    }

    public Employee get(String key){
        int hashKey= hashKey(key);
        if (employees[hashKey]==null){
            System.out.println("Employee not exist");
            return  null;

        }

        return employees[hashKey];

    }
    public void printHashTable(){

        for (Employee employee : employees) {
            System.out.print(employee+", ");
        }
        System.out.println("");
    }



    private int hashKey(String key){
        return key.length()%employees.length;
    }


}
