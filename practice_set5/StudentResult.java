interface Clasify{
    String getDivision(double average);
}

class result implements Clasify{
    public String getDivision(double average){
        if(average >= 60){
            return "First Division";
        } else if(average >= 50){
            return "Second Division";
        } else if(average >= 40){
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

class StudentResult{
    public static void main(String[] args){

        double marks1 = 75;
        double marks2 = 65;
        double marks3 = 55;

        double average = (marks1 + marks2 + marks3) / 3;

        result res = new result();
        String division = res.getDivision(average);

        System.out.println("Average Marks: " + average);
        System.out.println("Division: " + division);

    }
}