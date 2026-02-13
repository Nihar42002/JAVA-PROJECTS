class college{
    static int totalStudents;
    static String collegeName;

static{
    collegeName = "SVIT College";
}

{
    System.out.println("Object is created of college class");
}

college(){
    totalStudents++;
    System.out.println("constructor called");
}

  static int getTotalStudents(){
    return totalStudents;
    }

}
public class University {
    public static void main(String[] args){
        college c1 = new college();
        college c2 = new college();
        college c3 = new college();

        System.out.println("College Name: " + college.collegeName);
        System.out.println("Total Students: " + college.getTotalStudents());
    }
    
}
