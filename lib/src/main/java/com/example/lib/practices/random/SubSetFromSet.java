package com.example.lib.practices.random;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSetFromSet {
    public static void subset() {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().trim().split(" ");

        int k = 1;

        while (k <= n) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    ArrayList<Integer> list = new ArrayList<>();


                }

            }

            k++;
        }

    }

}
