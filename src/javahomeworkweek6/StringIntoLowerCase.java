package javahomeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class StringIntoLowerCase {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = input.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        input.close();
    }
}
