package inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }

    class bird extends Animal {
        void fly() {
            System.out.println("Birds fly");
        }
    }

    class lion extends Animal {
        void roar() {
            System.out.println("Lion roars");
        }
    }

    class humingBard extends bird {
        void small() {
            System.out.println("huming bird is small");
        }
    }
}

public class basic {
    Animal a1 = new Animal();
    a1.eat();
    a1.sleep();

    
}

// multi level, mutliple, heirarcikal, single
// java te multiple inheritance use kora jaina, solution => interface