
import java.util.Scanner;
public class Vowel{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
          letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println("vowel");
        } else 
            System.out.println("consonant");
    }
}



/*
| Feature                                  | `next().charAt(0)`            | `nextLine().charAt(0)`           
| -----------------------------------------------------------        | ------------------------------          | ------------------------------------------|
| Reads until...                             | Whitespace                  | Enter key (`\n`)                 
| Leading spaces                            | **Skipped** automatically      | **Counted** as characters                 
| First character if input = " abc"              | 'a'                        | ' ' (space)                              
| Risk of empty input                       | Very rare                   | Can throw error if user just presses Enter 
 
*/

/* 

    nextLine().charAt(0) :
        => \n er ag prjnto read krbe
        => leading space read krbe
    next().charAt(0) :
        => whitespace er ag prjnto read krbe (bakita buffer e patiye dibe)
        => leading space skip krbe

 */