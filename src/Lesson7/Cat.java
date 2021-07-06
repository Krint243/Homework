package Lesson7;

public class Cat {
    static String name;
    private final int appetite;
    private static boolean hangry;

    public Cat(String name, int appetite, boolean hangry) {
        Cat.name = name;
        this.appetite = appetite;
        Cat.hangry = hangry;
    }

    public void eat(Plate p) {
        if (hangry == true) {
            System.out.println("Кот " + name + " уже сыт");
            return;
        } else if (hangry == false) {
            p.decreaseFood(appetite);
            if (hangry == false) {
//
                System.out.println("Кот " + name + " не поел. в миске нет еды. сытость: " + hangry);
                return;
            }
            if (hangry == true) {
                System.out.println("Кот " + name + " поел, сытость: " + hangry);
                return;
            }


        }


    }

    public int getAppetite() {

        return appetite;
    }

    public static void setHangry(boolean hangry) {
        Cat.hangry = hangry;
    }
}


