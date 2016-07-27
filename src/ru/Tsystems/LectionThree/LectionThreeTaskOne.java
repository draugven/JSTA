package ru.Tsystems.LectionThree;
import java.util.Random;

/**
 * Created by enaimark on 25.07.2016.
 */
public class LectionThreeTaskOne {
    public static void main(String[] args) {
        int[] arr1 = new int[8];
        Random randomGenerator = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = randomGenerator.nextInt(9) +1;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 1; i < arr1.length; i += 2) {
            arr1[i] = 0;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
