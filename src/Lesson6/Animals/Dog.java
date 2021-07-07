package Lesson6.Animals;

public class Dog extends Animal {
    static int d;


    public Dog(String name) {
        this.name = name;
        d++;

    }

    public static int howMuchDogs() {
        return d;


    }

    @Override
    public void run(int a) {
        if (a > 500) {
            System.out.println("Собака " + name + " не может столько пробежать");
        } else if (a > 0 && a <= 500) {
            System.out.println("Собака " + name + " пробежала " + a + " метров");
        } else if (a == 0) {
            System.out.println("Собака " + name + " стоит на месте");
        } else System.out.println("Собака " + name + " пробежал " + -a + " метров назад");

    }

    @Override
    public void swim(int b) {
        if (b > 10) {
            System.out.println("Собака " + name + " не может столько проплыть");
        } else if (b > 0 && b <= 10) {
            System.out.println("Собака " + name + " проплыла " + b + " метров");
        } else if (b == 0) {
            System.out.println("Собака " + name + " плывет на месте");
        } else System.out.println("Собака " + name + " проплыла " + -b + " метров назад");

    }

}
