
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(Method1()); // запуск метода 1
        Method2(0); // Запуск метода 2 с установкой параметра внутри кода
        System.out.println(Method3(-5)); // Запуск метода 3 с установкой параметра внутри кода
        Method4("Не знаю как это работает, но оно работает", 6); // Запуск метода 4 с установкой параметра
        // string и int внутри кода
        System.out.println(Method5(2103));                          // Запуск метода 5 с установкой параметра внутри
    }                                                                   // кода

    static boolean Method1() {


        Scanner sc = new Scanner(System.in);   // Организовал в 1 методе вывод с клавиатуры в консоль
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println("Введите число");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Введены числа: " + a + " и " + b);
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    public static void Method2(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное!");
        } else
            System.out.println("Число положительное!");


    }

    static boolean Method3(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void Method4(String a, int b) {

        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean Method5(int a) {
        if (a % 4 == 0) { // шаг 1 - если год делится на 4 без остатка то перейти на 2 шаг
            if (a % 100 == 0) { // шаг 2 - если год делится на 100 без остатка то перейти на 3 шаг
                if (a % 400 == 0) { // если год делится на 400 без остатка
                    return true; // то он високосный
                } else return false; // а в противном случае он не високосный
            } else return true; // если год делится на 4 и потом на 100 без остатка то он високосный
        } else return false; // год не високосный если не делится на 4 без остатка
    }
}


