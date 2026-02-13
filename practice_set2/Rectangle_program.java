
import java.util.Scanner;

class rectangle {

    double width = 1;
    double height = 1;

    rectangle() 
    {

    }
    rectangle(double w, double h) 
    {
        width = w;
        height = h;
    }
    double getArea() 
    {
        return width * height;
    }
    double getPerimeter() 
    {
        return 2 * (width + height);
    }
    
}

public class Rectangle_program{
    public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the width of the rectangle:");
double w = scanner.nextDouble();
System.out.print("Enter the height of the rectangle:");
double h = scanner.nextDouble();
rectangle rect = new rectangle(w, h);
System.out.println("The area of the rectangle is: " + rect.getArea());
System.out.println("The perimeter of the rectangle is: " + rect.getPerimeter());
scanner.close();
    }
}
