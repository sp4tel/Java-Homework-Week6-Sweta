package javahomeworkweek6;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceAndStaticVariable1 {

    int x = 10;
    static int y = 20;
    //x is instance variable and y is static variable

    public static void main(String[] args) {
        InstanceAndStaticVariable1 obj = new InstanceAndStaticVariable1();
        obj.myMethod1();
        myMethod2();
    }

    public void myMethod1(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void myMethod2(){
        InstanceAndStaticVariable1 obj = new InstanceAndStaticVariable1();
        System.out.println(obj.x);
        System.out.println(y);
    }

}
