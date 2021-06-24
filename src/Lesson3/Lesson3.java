package Lesson3;

import java.util.Random;
import java.util.Arrays;
public class Lesson3 {
    public static void main(String[] args) {
        Method3();
    }

    public static void Method3() {
        int[] arr = new int[10];
        Random rand = new Random ();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = rand.nextInt(2);
        }
        System.out.println("Исходный массив" + Arrays.toString(arr));
    }
}
