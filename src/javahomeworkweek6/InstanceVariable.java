package javahomeworkweek6;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class InstanceVariable {
    int x = 10;
    int y = 30;
// x and y are Instance variables
    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.myMethod();
    }

    public void myMethod(){

        System.out.println(x);
        System.out.println(y);
    }
}
