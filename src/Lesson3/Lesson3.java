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


    }

    /**
     * Первое задание
     */
    public static void Method1() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);
        }
        System.out.println("Исходный массив:      " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println("Масив после инверсии: " + Arrays.toString(arr));
    }

    public static void Method2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Значение массива:     " + Arrays.toString(arr));

    }

    public static void Method3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Значение массива:     " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Массив после операций:" + Arrays.toString(arr));
    }

    public static void Method4() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i || j == arr[i].length - (i + 1)) {
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
        int Max = 0;
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
        int SumLL = 0;
        int SumRR = 0;
        int SumTotal = 0;
        int SumLR = 0;
        int SumRL = 0;
        for (int i = 0; i < array.length; i++) {
            SumTotal += array[i];

        }
        System.out.println("Сумма всех элементов массива: " + SumTotal);
        for (int i = 1; i < array.length - 1; i++) {
            SumLL += array[i - 1];
            SumRR = SumTotal - SumLL;
            if (SumRR == SumLL) {
                System.out.println("SumL: " + SumLL + " == " + "SumR: " + SumRR + " - True");
                break;
            } else if (i == array.length - 2) {
                System.out.println("В массиве нет места где сумма элементов массива равна - False");
            } else
                continue;
        }


    }
//        System.out.println("В массиве нет места где сумма элементов массива равна - False");
//            for (int j = 1; j < array.length - 1; j++) {
//                SumLR += array[j - 1];
//                SumRL = SumTotal - SumLR;
//                if (SumRR == SumLL || SumRL == SumLR) {
//                    System.out.println("SumL: " + SumLL + " == " + "SumR: " + SumRR);
////
//        break;
////                } else
////                    continue;   }


}

























