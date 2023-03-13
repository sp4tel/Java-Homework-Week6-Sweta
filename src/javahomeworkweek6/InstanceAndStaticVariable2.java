package javahomeworkweek6;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceAndStaticVariable2 {
    // a and b are instance variables
    int a = 5;
    int b = 10;
    // c and d are static variables
    static int c = 15;
    static int d = 20;

    public static void main(String[] args) {
        InstanceAndStaticVariable2 obj = new InstanceAndStaticVariable2();
        obj.myMethod1();
        myMethod2();
    }

    public void myMethod1(){

        System.out.println(a);
        System.out.println(b);
    }
    public static void myMethod2(){
        System.out.println(c);
        System.out.println(d);
    }
}
