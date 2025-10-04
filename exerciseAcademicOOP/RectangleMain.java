class Rectangle {
    float length;
    float width;
    double resutl;

    double calculateArea() {
        resutl = length * width;
        return resutl;
    }

    double calculatePerimeter() {
        resutl = 2 * (length + width);
        return resutl;
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.length = 12;
        r1.width = 5;
        double area = r1.calculateArea();
        double perimeter = r1.calculatePerimeter();
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        System.out.println("--------------------------");
    }
}