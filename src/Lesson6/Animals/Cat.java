package Lesson6.Animals;

public class Cat extends Animal {
    static int c;


    public Cat(String name) {
        this.name = name;
        c++;


    }

    public int howMuchCats() {
        return c;

    }

    @Override
    public void run(int a) {
        if (a > 200) {
            System.out.println("Кот " + name + " не может столько пробежать");
        } else if (a > 0 && a <= 200) {
            System.out.println("Кот " + name + " пробежал " + a + " метров");
        } else if (a == 0) {
            System.out.println("Кот " + name + " стоит на месте");
        } else System.out.println("Кот " + name + "пробежал " + -a + " метров назад");

    }

    @Override
    public void swim(int b) {
        System.out.println("Кот по имени " + name + " совсем как герой игр серии GTA - не умеет плавать(");
    }

}

