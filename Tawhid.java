class Student{
    String name;
    String id;
}
public class Tawhid{
    public static void main(String[] args){
       Student std1 = new Student();
       Student std2 = new Student();

       std1.name = "jamal";
       std1.id = "14";

       std2.name = "Arafat";
       std2.id = "45";

       System.out.println("Student1 : " + std1.name + " " + std1.id);
       System.out.println("Student2 : " + std2.name + " " + std2.id);
       System.out.println("----------------------------------------------------------------");
       
       std2 = std1; // copy referrence

       System.out.println("Student1 : " + std1.name + " " + std1.id);
       System.out.println("Student2 : " + std2.name + " " + std2.id);
    }
}

