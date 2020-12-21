package com.digitalcreo.edabit.challenges.single;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Quadratic {

    public int getQuadraticSolns(double aa, double bb, double cc) {
        double temp = Math.sqrt(bb * bb - 4 * aa * cc);
        double r1 = (-bb + temp) / (2 * aa);
        double r2 = (-bb - temp) / (2 * aa);
        if (temp > 0) {
            System.out.println("the equation has two real roots" + "\n" + " the roots are : " + r1 + " and " + r2);
            return 2;
        } else if (temp == 0) {
            double result = ((-bb / 2 * aa) == -0.0) ? 0 : (-bb / 2 * aa);
            System.out.println("the equation has one root" + "\n" + " The root is :  " + result);
            return 1;
        } else {
            System.out.println("the equation has no real roots !!!");
            return 0;
        }
    }

    public int leftShift(int actual, int shift) {
        return (int) (actual * Math.pow(2, shift));
    }

    public Integer[] factorize(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num > 0) {
            // loop runs from 1 to number
            for (int i = 1; i <= num; ++i) {
                // if number is divisible by i
                if (num % i == 0) {
                    result.add(i);
                }
            }
        }
        //     result.forEach(System.out::println);
        Integer[] objects = result.toArray(new Integer[result.size()]);

        System.out.println(" are :" + Arrays.toString(objects));
        return objects;
    }


    public static int warOfNumbers(int[] numbers) {
        Integer evenSum = Arrays.stream(numbers).filter(j -> j % 2 == 0).reduce(0, (a, b) -> a + b);
        Integer oddSum = Arrays.stream(numbers).filter(j -> j % 2 != 0).reduce(0, Integer::sum);

        int result = evenSum - oddSum;
        return Math.abs(result);
    }

    public static String flipEndChars(String s) {
        if (s.length() >= 2) {
            char[] splits = s.toCharArray();
            return (splits[splits.length - 1] == splits[0]) ? "Two's a pair." : flipChar(splits);
        } else {
            return "Incompatible.";
        }
    }

    private static String flipChar(char[] splits) {
        char inChar = splits[0];
        splits[0] = splits[splits.length - 1];
        splits[splits.length - 1] = inChar;
        return String.valueOf(splits);
    }

    public static String[] dictionary(String s, String[] w) {
        return Arrays.stream(w)
                .filter(wr -> s.length() <= wr.length() && wr.substring(0, s.length()).equalsIgnoreCase(s))
                .collect(Collectors.toList()).toArray(new String[0]);
    }

    public boolean isInOrder(String str) {
        boolean result = false;
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        String newArray = String.valueOf(charArray);
        if (newArray.equals(str)) result = true;
        return result;
    }

    public int highestDigit(int n) {
        int largest = 0;
        while (n != 0) {
            int r = n % 10;
            // Find the largest digit
            largest = Math.max(r, largest);
            n = n / 10;
        }
        return largest;
    }

    public int numOfDigits(int num) {
        return (String.valueOf(num).startsWith("+") || String.valueOf(num).startsWith("-")) ?
                String.valueOf(num).length() - 1 : String.valueOf(num).length();
    }

    public double[] otherSides(int n) {
        double[] result = new double[2];
        BigDecimal bd1 = new BigDecimal(2 * n).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd2 = new BigDecimal(n * Math.sqrt(3)).setScale(2, RoundingMode.HALF_UP);
        result[0] = bd1.doubleValue();
        result[1] = bd2.doubleValue();
        return result;
    }

    public int[] arrayOfMultiples(int num, int length) {
        int count = 0;
        int[] multiples = new int[length];
        while(count < length){
            multiples[count] = num * (count+1);
            count++;
        }
        return multiples;
    }

    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic();
        //    quadratic.getQuadraticSolns(1, 0, 0);
        //    System.out.println(">>>>>>>> Left Shift :" + quadratic.leftShift(10, 3));
        //    Integer[] factors = quadratic.factorize(10);
        //    System.out.println("Factors are :" + Arrays.toString(factors));
        //    quadratic.warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
        //    System.out.println(quadratic.flipEndChars("a"));
       // String[] dic = quadratic.dictionary("there", new String[]{"there", "here", "everywhere"});
       // Arrays.stream(dic).forEach(System.out::println);
       // System.out.println(quadratic.isInOrder("aciis"));
       // System.out.println(quadratic.highestDigit(2893));
        double [] res = quadratic.otherSides(1);
        Arrays.stream(res).forEach(System.out::println);
        Arrays.stream(quadratic.arrayOfMultiples(5,6)).forEach(System.out::println);
    }
}