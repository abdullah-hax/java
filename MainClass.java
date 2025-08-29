class Student{

    //attribute (data) , class er student der blueprint
    int id;
    String name;
    String session;
    String bloodGrp;
    String gender;
    
    //behavior(method)
    public void display(){
        System.out.print("\n");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Blood Group : " + bloodGrp);
        System.out.println("Gender : " + gender);
        System.out.println("---------------------------------------------");
    }
}

class MainClass{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 01;
        s1.name = "Abdullah";
        s1.session = "2024-25";
        s1.bloodGrp = "AB+";
        s1.gender = "Male";

        s2.id = 02;
        s2.name = "Arman";
        s2.session = "2024-25";
        s2.bloodGrp = "B+";
        s2.gender = "Male";

        s1.display();
        s2.display();
        //  s1, s2 egulo hlo object.
    }
}