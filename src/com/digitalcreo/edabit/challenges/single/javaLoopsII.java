package com.digitalcreo.edabit.challenges.single;

import java.util.Scanner;

public class javaLoopsII {
    public void series() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int count = 0;
            int c = a;
            while (count < n) {
                c += (Math.pow(2, count) * b);
                count++;
                System.out.printf("%s ", c);
            }
            System.out.println();
        }
        in.close();
    }

    public static void main(String[] args) {
        javaLoopsII out = new javaLoopsII();
        //    System.out.println(0 + (Math.pow(2, 0) * 2));
        out.series();
    }
}
