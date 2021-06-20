import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(Method1());
    }

    static boolean Method1() {


        Scanner sc = new Scanner(System.in);
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
}
