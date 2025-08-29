class ractangle{
    int length;
    int width;
    double area;
    double porisima;

    public void display(){

        area = length*width;
        porisima = 2*(length + width);
        System.out.println("Area : " + area);
        System.out.println("Porisima : " + porisima);
    }
}

class porisima{
    public static void main(String[] args){
        ractangle s = new ractangle();

        s.length = 12;
        s.width = 5;

	s.display();
    }
}