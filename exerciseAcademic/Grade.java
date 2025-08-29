
import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int marks;
		marks = input.nextInt();

		switch(marks/10) {

		case 10 :
			System.out.println("A+");
			break;
		case 9 : 
			System.out.println("A+");
			break;
		case 8 : 
			System.out.println("B");
			break;
		case 7 : 
			System.out.println("C");
			break;
		default : 
			System.out.println("Fail");

		}
	}

}