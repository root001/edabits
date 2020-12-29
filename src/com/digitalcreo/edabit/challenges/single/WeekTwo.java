package com.digitalcreo.edabit.challenges.single;

import java.util.Arrays;
import java.util.Scanner;

public class WeekTwo {
    /**
     * Week 2 Java Edabit challenges
     * <p>
     * public boolean validate(String pin) {
     * System.out.println("Pattern matches : "+Pattern.matches("[0-9]", pin));
     * <p>
     * if(pin.matches("/[0-9]/"))
     * return true;
     * else
     * return false;
     * }
     */
    public int quadraticEquation(int a, int b, int c) {
        double temp = Math.sqrt(b * b - 4 * a * c);
        double r1 = (-b + temp) / (2 * a);
        if (temp > 0) {
            return (int) Math.abs(r1);
        } else if (temp == 0) {
            double result = ((-b / 2 * a) == -0.0) ? 0 : (-b / 2 * a);
            return (int) Math.abs(result);
        } else {
            System.out.println("the equation has no real roots !!!");
            return 0;
        }
    }

    public int euclidean(int a, int b) {
        int r = 1;
        int res = 0;
        while (r > 0) {
            if (a < b) {
                int a1 = a;
                a = b;
                b = a1;
            }
            r = a % b;
            //     System.out.println("r is:"+r+" b is:"+b);
            res = b;
            a = b;
            b = r;
        }
        return res;
    }

    public int sum(int[] arr) {
        if (arr.length > 0) {
            int res = arr[arr.length - 1] + sum(Arrays.copyOf(arr, arr.length - 1));
            System.out.println("result is :" + res);
            return res;
        } else {
            return 0;
        }
    }

    public Object[] clone(Object[] arr) {
        Object[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = arr;
        return newArr;
    }

    public String gradePercentage(String userScore, String passScore){
        String s = "";
        if (Integer.parseInt(userScore.substring(0,userScore.length()-1)) >= Integer.parseInt(passScore.substring(0,passScore.length()-1))){
            s += "PASSED";
        }else{
            s += "FAILED";
        }
        return "You " + s + " the Exam";
    }

    // Hackerrank Starter Challenges
    public void scanner1() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public String conditionals(int input) {
        if ((input % 2) == 0 && input >= 2 && input <= 5) {
            return "Not Weird";
        } else if ((input % 2) == 0 && input >= 6 && input <= 20) {
            return "Weird";
        } else if ((input % 2) == 0 && input > 20) {
            return "Not Weird";
        } else {
            return "Weird";
        }
    }

    public void scanner2(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.useDelimiter("\n");
        String s = scan.next();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
