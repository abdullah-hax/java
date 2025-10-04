class Student {
    String name;
    int rollNumber;
    int[] marks = new int[5];

    double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 80)
            return 'A';
        else if (avg >= 70)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 50)
            return 'D';
        else
            return 'F';
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("------------------------");
    }
}

public class GradeSystemC {
    public static void main(String[] args) {
        int[] marks1 = { 85, 90, 78, 88, 92 };
        int[] marks2 = { 60, 55, 70, 58, 62 };

        Student s1 = new Student();
        s1.name = "Arman";
        s1.rollNumber = 101;
        s1.marks = marks1;

        Student s2 = new Student();
        s2.name = "Abdur Rahman";
        s2.rollNumber = 102;
        s2.marks = marks2;

        s1.showInfo();
        s2.showInfo();
    }
}
