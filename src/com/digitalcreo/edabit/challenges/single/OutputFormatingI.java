package com.digitalcreo.edabit.challenges.single;

import java.util.Scanner;

public class OutputFormatingI {
    public void OutputFormats(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            int x=sc.nextInt();
            sc.nextLine();
            String s1=sc.nextLine();
            //Complete this line
            System.out.println(String.format("%-" + 15 + "s", s1)+String.format("%" + 3 + "d", x).replace(' ', '0'));
        }
        System.out.println("================================");
    }
    public void OutputFormatsAlt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {

            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }


    public static void main(String[] args) {
        OutputFormatingI out = new OutputFormatingI();
        out.OutputFormats();
    }
}
