package Lesson7;

public class Plate {
    static int food;
  private static boolean hangry;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
            Cat.setHangry(true);
return;
        }
        if (food - n < 0)
            Cat.setHangry(false);
return;

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
