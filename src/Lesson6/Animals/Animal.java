package Lesson6.Animals;

public class Animal {
    String name;
    static int an;

    public Animal() {
        an++;
    }
    public Animal(String name) {
        this.name = name;


    }

    public static int howMuchAnimals() {
        return an;
    }

    public void swim(int a) {
        System.out.println("Животное по имени " + name + "плывет");
    }

    public void run(int b) {
        System.out.println("Животное по имени " + name + "бежит");
    }
}

