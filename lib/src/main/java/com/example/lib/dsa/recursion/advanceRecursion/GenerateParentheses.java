package com.example.lib.dsa.recursion.advanceRecursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

   /* Given n pairs of parentheses. write a function to generate all combinations of well-formed parentheses.

    Example 1:
    Input: n =3
    Output: ["((()))","(()())", "(())()","()(())","()()()"]

    Example 2:
    Input; n =1
    Output: ("( )"


    */
    static ArrayList<String> arrayList = new ArrayList<>();
    public static ArrayList<String> generate(String s, int open, int close){
        if(open==0 && close==0){
            arrayList.add(s);
            return arrayList;

        }

        if(open>0){
            s+="(";
            generate(s,open-1,close);
            s=s.substring(0,s.length()-1);

        }
        if (close>0 && close>open){
            s+=")";
            generate(s,open,close-1);
            s=s.substring(0,s.length()-1);



        }



        return  arrayList;


    }
}
