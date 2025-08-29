
import java.util.Scanner;
public class GreaterNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();

        if(a > b){
            System.out.println(a + " is greater");
        } else {

            System.out.println(b + " is greater");
        }
        
    }
}