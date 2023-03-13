package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class AverageOfNumbers {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();
        input.close();
        System.out.println("The average is:" + avr(a, b, c) );
    }

    public static double avr(double a, double b, double c){

        return (a + b + c) / 3;
    }
}

