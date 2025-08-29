import java.util.Scanner;

public class DoWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int n;
		n = input.nextInt();

		int fact = 1, i = 1;

		do{
			fact = fact*i;
			i++;

		} while(i <= n);

		System.out.println(fact);
	}

}