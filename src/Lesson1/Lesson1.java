package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        PrintThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void PrintThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = -6;
        int b = 5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная!");
        } else
            System.out.println("Сумма отрицательная!");
    }

    public static void printColor() {
        int value = -666;
        if (value <= 0) {
            System.out.println("Красный!");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый!");
        } else {
            System.out.println("Зеленый!");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}