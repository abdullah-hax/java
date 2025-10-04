class Example {
    final int x;  // blank final variable

    Example(int value){
        x = value;
    }

    void display() {
        System.out.println("Value of x: " + x);
    }
}

public class BlankFinalTest {
    public static void main(String[] args) {
        Example e1 = new Example(10);
        Example e2 = new Example(20);

        e1.display();
        e2.display();
    }
}
