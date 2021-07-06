package Lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Кися",30,false);
        Plate plate = new Plate(60);
        plate.info();
        cat.eat(plate);
//        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
//        plate.setFood(50);
//        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
    }
}
