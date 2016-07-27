package ru.Tsystems.LectionThree;

import static java.lang.System.out;

/**
 * Created by enaimark on 18.07.2016.
 */
public class LectionThree {
    public static void main(String[] args) {

        int[][] arr1 = new int[2][5];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

            }
        }

        Object[] arr = new Object[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Object();
            out.println(i + ": " + arr[i]);
        }
    }
}
