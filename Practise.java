import java.util.Scanner;

public class Practise{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        input.nextLine();
        String title = input.nextLine();
        double price = input.nextDouble();
        input.nextLine();
        String description = input.nextLine();
        float data = input.nextFloat();

        System.out.println("id        : " + id);
        System.out.println("title       : " + title);
        System.out.println("price      : " + price);
        System.out.println("description : " + description);
        System.out.println("data      : " + data);
        
    }
}