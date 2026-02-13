class Point{
    int x ;
    int y ;

    Point(){
        x = 6;
        y = 9;
    }

   Point(int a, int b){
      this.x = a;
       this.y = b;
    }

   Point(Point p){
        x = p.x;
        y = p.y;
    }

    void displayPoint(){
        System.out.println("Point coordinates are: (" + x + ", " + y + ")");
    }


}

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(p2);

        p1.displayPoint();
        p2.displayPoint();
        p3.displayPoint();
    }
    
}
