package com.example.lib.contest.contenst90;

import java.util.Scanner;

public class Fourth {
    public static void ap(){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int N = (int) Math.pow(10, 6) + 10;
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str[] = sc.nextLine().trim().split(" ");
            int g[] = new int[N];
            boolean is_ap = false;
            for (int i = 0; i < n - 2; i++) {
                if (is_ap) {
                    break;
                }
                for (int j = 0; j < n; j++) {
                    if (is_ap) {
                        break;
                    }
                    if (j == i) {
                        continue;
                    }
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) {
                            continue;

                        }
                        System.out.println(Integer.parseInt(str[j]) + "-" + Integer.parseInt(str[i]) + "=" + (Integer.parseInt(str[j]) - Integer.parseInt(str[i])) + " " + Integer.parseInt(str[k]) + "-" + Integer.parseInt(str[j]) + "=" + (Integer.parseInt(str[k]) - Integer.parseInt(str[j])));


                        if (Integer.parseInt(str[j]) - Integer.parseInt(str[i]) == Integer.parseInt(str[k]) - Integer.parseInt(str[j])) {

                            is_ap = true;
                            break;
                        }

                    }

                }
            }


            if (is_ap) {
                System.out.println("NO");

            } else {
                System.out.println("YES");
            }


        }
    }

}
