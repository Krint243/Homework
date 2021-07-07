package Lesson3;

import java.util.Random;
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Method1();
        System.out.println();
        System.out.println("Задание 2");
        Method2();
        System.out.println();
        System.out.println("Задание 3");
        Method3();
        System.out.println();
        System.out.println("Задание 4");
        Method4();
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Значение массива:     " + Arrays.toString(Method5(6, 8)));
        System.out.println();
        System.out.println("Задание 6");
        maxminmassiv();
        System.out.println();
        System.out.println("Задание 7");
        checkBalance(new int[]{1, 0, 3, 3, 0, 7});
        System.out.println();
        System.out.println("Задание 8");
        System.out.println("Массив после сдвига: " + Arrays.toString(Method6(new int[]{1, 0, 3, 3, 0, 7}, 1))); // сдвигает только влево на положительное n

    }

    /**
     * Первое задание
     */
    public static void Method1() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);   // Заполняем рандомными числами от 0 до 2
        }
        System.out.println("Исходный массив:      " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {                    // если элемент массива равен 1 записываем 0
                arr[i] = 0;
            } else arr[i] = 1;                  // если не равен 0 записываем 1
        }
        System.out.println("Масив после инверсии: " + Arrays.toString(arr));
    }

    public static void Method2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;                     // заполняем массив в цикле
        }
        System.out.println("Значение массива:     " + Arrays.toString(arr));

    }

    public static void Method3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Значение массива:     " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {                                        // проверяем и редактируем необходимые элементы
                arr[i] *= 2;
            }
        }
        System.out.println("Массив после операций:" + Arrays.toString(arr));
    }

    public static void Method4() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i || j == arr[i].length - (i + 1)) {        // условие для нахождения диагоналей двумерного массива
                    arr[i][j] = 1;
                } else
                    arr[i][j] = 0;
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();

        }
    }

    public static int[] Method5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;


    }

    public static void maxminmassiv() {
        int[] arr = new int[10];
        int Max = -1;                              // задаем константы выходящие за область bound
        int Min = 101;
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("Исходный массив:     " + Arrays.toString(arr));
        System.out.println("Максимальный элемент массива: " + Max);
        System.out.println("Минимальный элемент массива:  " + Min);
    }

    public static void checkBalance(int[] array) {
        System.out.println("Исходный массив:     " + Arrays.toString(array));
        int SumLL = 0;                                          // Задаем сумму левой части массива
        int SumRR = 0;                                          // Задаем сумму правой части массива
        int SumTotal = 0;                                       // Задаем сумму всех элементов массива
        for (int i = 0; i < array.length; i++) {
            SumTotal += array[i];                             // Считаемв цикле сумму всех элементов массива

        }
        System.out.println("Сумма всех элементов массива: " + SumTotal);     // Выводим сумму всех элементов массива
        for (int i = 1; i < array.length - 1; i++) {
            SumLL += array[i - 1];
            SumRR = SumTotal - SumLL;                           // В цикле сравниваем суммы левых и правых элементов массива,
            if (SumRR == SumLL) {                               // вычетая из общей суммы сумму левой части массива
                System.out.println("SumL: " + SumLL + " == " + "SumR: " + SumRR + " - True");      // если нашли место где суммы равны выходим из цикла
                break;
            } else if (i == array.length - 2) {                    // в противном случае такого места в массиве нет
                System.out.println("В массиве нет места где сумма элементов массива равна - False");
            } else
                continue;
        }


    }

    public static int[] Method6(int[] array, int n) {
        int currentIndex, movedIndex, buffer;
        System.out.println("Исходный массив:     " + Arrays.toString(array));
        for (int i = 0; i < greatestCommonDivision(n, array.length); i++) {
            buffer = array[i];
            currentIndex = i;
            if (n > 0) {
                while (true) {
                    movedIndex = currentIndex + n;
                    if (movedIndex >= array.length)
                        movedIndex = movedIndex - array.length;

                    if (movedIndex == i) {
                        break;
                    } else
                        array[currentIndex] = array[movedIndex];
                    currentIndex = movedIndex;
                }
            }
            if (n < 0)
                while (true) {
                    movedIndex = currentIndex + n;

                    if (movedIndex < 0) {
                        movedIndex = array.length + movedIndex;

                        if (movedIndex == i)
                            break;
                    } else

                        array[currentIndex] = array[movedIndex];
                    currentIndex = movedIndex;

                }
            array[currentIndex] = buffer;
        }

        return array;
    }


    public static int greatestCommonDivision(int a, int b) {
        if (b == 0)
            return a;
        else return greatestCommonDivision(b, a % b);
    }
}
































