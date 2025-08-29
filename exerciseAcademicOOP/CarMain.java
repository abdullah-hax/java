class Car{
	String brand;
	String model;
	int year;

	public void displayInfo(){
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
	}
}

class CarMain{
	public static void main(String[] args){
		Car object1 = new Car();
		Car object2 = new Car();

		object1.brand = "Toyota";
		object1.model = "Land Cruiser";
		object1.year = 2025;

		object2.brand = "Lexus";
		object2.model = "IS";
		object2.year = 2024;

		object1.displayInfo();
		object2.displayInfo();
	}

}