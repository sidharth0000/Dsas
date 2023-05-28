package com.example.lib.practices.random;

public class SymbolInGrammar {
    //https://leetcode.com/problems/k-th-symbol-in-grammar/
    public int kthGrammar(int n, int k) {
        String[] arr = new String[n];
        arr[0] = "0";
        for (int i = 1; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < arr[i - 1].length(); j++) {

                if (arr[i - 1].charAt(j) == '0') {
                    str.append("01");
                } else if (arr[i - 1].charAt(j) == '1') {
                    str.append("10");
                }
            }
            arr[i] = str.toString();

        }

        return Integer.parseInt(String.valueOf(arr[n - 1].charAt(k - 1)));
    }

}
