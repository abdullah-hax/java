
import java.util.Scanner;
public class Absolute{

    public static int abs(int x){
        if (x < 0){
            return -x;
        }
        return x;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        num = abs(num);

        System.out.println(num);
        return;

    }
}


/* 

| Language  | Normal End         | Force Exit with Code           
| --------     | ---------------------       | ------------------------------ |
| **C**    | return 0;            | exit(0);  (from <stdlib.h>) 
| **Go**   | return (from main)    | os.Exit(0)                  
| **Java**  | return; (from main)   | System.exit(0);   
            
*/


/* 
| Language  | What happens after `return` in `main`?                                                   
| --------     | ------------------------------------------------------------------------------------------- |
| **Java**  | Ends `main` thread. Other non-daemon threads keep running. JVM continues until they finish. 
| **Go**   | Ends `main`. **All goroutines are killed** immediately, program stops.    



go func() {
    fmt.Println("This is a goroutine")
}()


new Thread(() -> {
            while (true) {
                System.out.println("Background thread still alive!");
            }
        }).start();

*/