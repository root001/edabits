package com.digitalcreo.edabit.challenges.single;

import java.util.Scanner;

public class javaLoopsMultiples {
    private static final Scanner scanner = new Scanner(System.in);
    public void javaMultiples(){
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int i = 1;
        while(i <= 10){
            System.out.println(N+" x "+i+" = "+(N * i));
            i++;
        }
    }

    public static void main(String[] args) {
        javaLoopsMultiples out = new javaLoopsMultiples();
        out.javaMultiples();
    }

}
