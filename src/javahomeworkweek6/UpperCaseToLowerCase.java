package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class UpperCaseToLowerCase {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = input.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        input.close();
    }
}
