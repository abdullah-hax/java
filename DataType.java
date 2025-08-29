public class DataType{
    public static void main(String[] args){
        boolean b = true;
        char c = 'a';
        int i = 126587;
        short s = 32677;
        float f = 10.68f;
        double d = 12.4;

        System.out.println("boolean = " +b);
        System.out.println("char = " +c);
        System.out.println("int = "+i);
        System.out.println("short = "+s);
        System.out.println("float = "+f);
        System.out.println("double = "+d);


        System.out.printf("boolean = %b\n", b);
        System.out.printf("char = %c\n", c);
        System.out.printf("int = %d\n", i);
        System.out.printf("short = %d\n", s);
        System.out.printf("float = %.2f\n", f);
        System.out.printf("double = %.1f\n", d);
    }
}