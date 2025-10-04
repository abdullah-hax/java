class Circle {
    float radius;
    float area;
    float circum;

    void area() {
        area = 3.1416f * radius * radius;
    }

    void circumference() {
        circum = 2 * 3.1416f * radius;
    }

    void display() {

        System.out.println(area);
        System.out.println(circum);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 3;
        c1.area();
        c1.circumference();
        c1.display();
    }
}
