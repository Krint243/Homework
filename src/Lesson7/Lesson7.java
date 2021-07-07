package Lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[10];
        Plate plate = new Plate(100);
        catArray[0] = new Cat("Кися", 40, false);
        catArray[1] = new Cat("Фися", 20, false);
        catArray[2] = new Cat("Бася", 10, false);
        catArray[3] = new Cat("Шура", 35, false);
        catArray[4] = new Cat("Гена", 10, false);
        catArray[5] = new Cat("Вася", 40, false);
        catArray[6] = new Cat("Дуся", 20, false);
        catArray[7] = new Cat("Гыня", 10, false);
        catArray[8] = new Cat("Носик", 35, false);
        catArray[9] = new Cat("Фрося", 10, false);
        for (int i = 0; i < catArray.length; i++) {
            plate.info();
            catArray[i].eat(plate);
            if (plate.getFood() <= 0) {
                plate.increaseFood(100);
                System.out.println("Наполнили миску едой");
            }
        }
    }
}



