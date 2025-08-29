class Rectangle{
    int length;
    int width;

    int calculateArea(){
        int area = length * width;
        return area;
    }

    int calculatePerimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }


}

public class RectangleMain{
    public static void main(String[] args){
        Rectangle rect = new Rectangle();

        rect.length = 12;
        rect.width = 5;

        int area = rect.calculateArea();
        int perimeter = rect.calculatePerimeter();

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}