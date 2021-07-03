package Lesson6;

import Lesson6.Animals.Animal;
import Lesson6.Animals.Cat;
import Lesson6.Animals.Dog;

public class Lesson6 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Животное1");
        Dog dog = new Dog("Зефир");
        dog.run(15);
        dog.swim(5);
        Animal animal2 = new Animal("Животное2");
        Cat cat = new Cat("Кися");
        cat.run(0);
        cat.swim(6);
        Animal animal3 = new Animal("Животное3");
        Dog dog2 = new Dog("Вульф");
        dog2.run(15);
        dog2.swim(5);
        Animal animal4 = new Animal("Животное5");
        Cat cat2 = new Cat("Фрося");
        cat2.run(0);
        cat2.swim(6);

        System.out.println("Было создано " + Animal.howMuchAnimals() + " животных");
        System.out.println("Было создано " + Cat.howMuchCats() + " кота");
        System.out.println("Было создано " + Dog.howMuchDogs() + " собаки");
    }


}
