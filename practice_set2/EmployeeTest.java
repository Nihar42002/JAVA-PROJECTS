class employee{

    private String employeeName;
    private int employeeSalary;

    public void readEmployeeData(String name, int salary)
    {
        this.employeeName = name;
        this.employeeSalary = salary;
    }
  
    public void displayEmployeeData()
    {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Employee Salary: " + this.employeeSalary);
    }
}

public class EmployeeTest{
    public static void main(String[] args)
    {
        employee emp = new employee();
        emp.readEmployeeData("John Doe", 50000);
        emp.displayEmployeeData();
    }
}