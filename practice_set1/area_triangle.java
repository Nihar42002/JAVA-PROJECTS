import java.util.Scanner;

public class area_triangle {

public static void main(String[] args)
{
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter the Sides of the triangle:");
double a = scanner.nextDouble();
double b = scanner.nextDouble();
double c = scanner.nextDouble();

if(a+b>c && a+c>b && b+c>a){
    System.out.println("Valid triangle sides.");   

double s = (a + b + c) / 2;

double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

System.out.println("The area of the triangle is: " + area);
scanner.close();

}
else{
    System.out.println("Invalid triangle sides.");
}

}   
}
