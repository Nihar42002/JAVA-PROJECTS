class ShapeData{
    double d1;
    double d2;

   void getData(double d1, double d2){
this.d1 = d1;
this.d2 = d2;
    }
}

class Triangle extends ShapeData{
    double CalculateArea(){
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends ShapeData{
    double CalculateArea(){
return d1 * d2; 
    }
}

public class Shape{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.getData(10, 20);
        System.out.println("Area of Triangle: " + t1.CalculateArea());

        Rectangle r1 = new Rectangle();
        r1.getData(10, 20);
        System.out.println("Area of Rectangle: " + r1.CalculateArea());
    }
}