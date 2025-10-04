class Student{
    private String name;
    private int roll;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }

    public int getRoll(){
        return roll;
    }
}

public class Practise {
    public static void main(String[] args) {
       Student s1 = new Student();

       s1.setName("arif");
       s1.setRoll(23);

       System.out.println("name : " + s1.getName());


    }
    
}
