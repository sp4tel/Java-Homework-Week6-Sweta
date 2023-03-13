package javahomeworkweek6;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Calculator {


    public static void main(String[] args) {


        Calculator input = new Calculator();
        input.addition(10,5);
        input.subtraction(15,8);
        multiplication(5,5);
        division(20,5);

    }
    public void addition(int a, int b){
        int ans = a + b;
        System.out.println(ans);
    }
    public void subtraction(int a, int b){
        int ans = a - b;
        System.out.println(ans);
    }
    public static void multiplication(int a, int b){
        int ans = a * b;
        System.out.println(ans);
    }
    public static void division(int a,int b){
        int ans = a / b;
        System.out.println(ans);
    }



}
