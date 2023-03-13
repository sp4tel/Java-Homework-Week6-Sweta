package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class AreaOfTriangle {
    public static void main(String args[]){

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double b= input.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double h= input.nextDouble();
        input.close();

        //Area = (width*height)/2
        double area=(b*h)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}
