
import java.util.Scanner;
public class Eligibility{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int $age;
        $age = input.nextInt();

        if($age >= 18){
            System.out.println("Eligible");
        } else {

            System.out.println("Not Eligible");
        }

    }
}