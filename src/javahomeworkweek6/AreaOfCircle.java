package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class AreaOfCircle {

    static double radius,area;
    static double pi = 3.14;
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = a.nextDouble();
        myMethod();
        a.close();
    }
    public static void myMethod(){
        area = pi * radius * radius;
        System.out.println("Area of the circle :" + area);
    }
}
