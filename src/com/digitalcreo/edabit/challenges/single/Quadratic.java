package com.digitalcreo.edabit.challenges.single;

public class Quadratic {

    public void getQuadraticSolns(double aa, double bb, double cc) {
        double temp = Math.sqrt(bb * bb - 4 * aa * cc);
        double r1 = (-bb + temp) / (2 * aa);
        double r2 = (-bb - temp) / (2 * aa);
        if (temp > 0) {
            System.out.println("the equation has two real roots" + "\n" + " the roots are : " + r1 + " and " + r2);
        } else if (temp == 0) {
            double result = ((-bb / 2 * aa) == -0.0) ? 0 : (-bb / 2 * aa);
            System.out.println("the equation has one root" + "\n" + " The root is :  " + result);
        } else {
            System.out.println("the equation has no real roots !!!");
        }
    }

    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic();
        quadratic.getQuadraticSolns(1, 0, 0);
    }
}