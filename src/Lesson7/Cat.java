package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hangry;


    public Cat(String name, int appetite, boolean hangry) {
        this.name = name;
        this.appetite = appetite;
        this.hangry = hangry;
    }

    public void eat(Plate p) {
        if (hangry == true) {
            System.out.println("Кот " + name + " уже сыт");
            return;
        } else if (hangry == false) {
            p.decreaseFood(appetite);
            if (p.f == false) {
                setHangry(false);
                System.out.println("Кот " + name + " не поел. в миске нет еды. сытость: " + hangry);
            }
            if (p.f == true) {
                setHangry(true);
                System.out.println("Кот " + name + " поел, сытость: " + hangry);
            }
        }
    }

    public int getAppetite() {

        return appetite;
    }

    public void setHangry(boolean hangry) {
        this.hangry = hangry;
    }


}


