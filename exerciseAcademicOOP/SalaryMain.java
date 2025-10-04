
class Employee {
    String name;
    String designation;
    double salary;

    double increaseSalary(double bonus) {
        salary = salary + bonus;
        return salary;
    }
}

public class SalaryMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.salary = 70000;

        double currentSalary = e1.increaseSalary(20000);
        System.out.println("\nCurrent Salary : " + currentSalary);
    }
}
