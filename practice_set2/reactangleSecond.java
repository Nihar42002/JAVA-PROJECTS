class reactanglecompare{
    int width;
    int height;

    reactanglecompare(int w, int h){
        width = w;
        height = h;
    }
    int area(){
        return width * height;
    }
    int perimeter(){
        return 2 * (width + height);
    }

    void display(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

        static void compareAreas(reactanglecompare rect1, reactanglecompare rect2) {
        if (rect1.area() > rect2.area()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (rect1.area() < rect2.area()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

public class reactangleSecond {
    public static void main(String[] args){
        reactanglecompare rect1 = new reactanglecompare(5, 10);
        System.out.println("Details of Rectangle 1:");
        rect1.display();
        reactanglecompare rect2 = new reactanglecompare(7, 8);
        System.out.println("Details of Rectangle 2:");
        rect2.display();

        System.out.println("Comparing areas of the two rectangles:");
        reactanglecompare.compareAreas(rect1, rect2);
    }
    
}
