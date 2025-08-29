
import java.util.Scanner;
public class PosOrNeg{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num;
        num = input.nextLine();

        if(num.charAt(0) == '-') {
            System.out.println("negative number");
        } else {
            System.out.println("positive number");
        }

        input.close();
       
    }
} 