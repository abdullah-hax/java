
class Employee{
    private String empId;
    private double salary;
    private String designation;

    Employee(String id, double sal, String des){
        empId = id;
        salary = sal;
        designation = des;
    }

    public void setId(){
        
    }

    public double getId(){
        return empId;
    }

    public void setDesignation(String d){
        designation = d;
    }

    public String getDesignation(){
        return designation;
    }

    public void setSalary(double s){
        salary = salary + salary*s/100;
    }

    public double getSalary(){
        return salary;
    }

}


public class EmployeeMain {
    
}
