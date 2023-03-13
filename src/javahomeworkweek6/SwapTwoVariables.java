package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class SwapTwoVariables {

    public static void main(String[] args) {
        int a, b, x;// a and b are to swap
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("before swapping numbers: "+a +"  "+ b);
        /*swapping */
        x = a;
        a = b;
        b = x;
        System.out.println("After swapping: "+a +"   " + b);
        System.out.println( );
        input.close();
    }
}
