package javahomeworkweek6;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.5 * 8.5 = 47.60
 * Perimeter is 2 * (5.5 + 8.5) = 28.20
 */
public class AreaAndPerimeterOfRectangle {

    public static void main(String[] strings) {

        double width = 5.5;
        double height = 8.5;

        double perimeter = 2*(height + width);

        double area = width * height;

        System.out.println("Perimeter is " + "2*(" + height + "+" + width + ")" + " = "+ perimeter);

        System.out.println("Area is " + width + "*" + height + " = " + area);
    }
}

