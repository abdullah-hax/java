import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner abacas = new Scanner(System.in);
        String hello = "Hello IIT!";
        String name;
        int num;
        double fraction;
        name = abacas.nextLine();
        num = abacas.nextInt();
        fraction = abacas.nextDouble();

        System.out.println(hello);
        System.out.println(name);
        System.out.println(num);
        System.out.println("the fraction is : "+fraction);
    }
}


/* 

  Class name & String hbe capital letter e.

*/