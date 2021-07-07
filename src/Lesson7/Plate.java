package Lesson7;


public class Plate {
    private int food;
    public boolean f;

    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
            f = true;


            return;
        }
        if (food - n < 0)
            f = false;
        return;

    }
    public void increaseFood(int n) {
        food += n;
    }


    public void info() {
        System.out.println("plate: " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }


}
