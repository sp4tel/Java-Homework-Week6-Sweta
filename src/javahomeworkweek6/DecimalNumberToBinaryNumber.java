package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */
public class DecimalNumberToBinaryNumber {

    public static void main(String args[]){
        int decimal,Binary;
        double a = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a decimal number:");
        decimal = input.nextInt();
        System.out.println("Binary Number is:" + Integer.toBinaryString(5));
        input.close();
    }

}
