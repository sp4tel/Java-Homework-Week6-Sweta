package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 */
public class BinaryNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st binary number : ");
        String x = input.next();

        System.out.println("Enter 2nd binary number : ");
        String y = input.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1+n2;

        System.out.println("n3 =n1+n2 : " +Integer.toBinaryString(n3));
        input.close();
    }



}

