public class Rectangle{
	double length;
	double width;

	Rectangle(double len, double wid){
		length = len;
		width = wid;
	}

	double calculateArea(){
		double area = length * width;
		return area;
	}

	double calculatePerimeter(){
		double perimeter = 2*(length + width);
		return perimeter;
	}
}


public class RectangleMain{
	public static void main(String[] args){
		Rectangle rec1 = new Rectangle(12, 5);
		
		double area = calculateArea();
		double perimeter = calculatePerimeter();

		System.out.println(area);
		System.out.println(perimeter);
		

		
		
		
	}
}