package ru.Tsystems.LectionTwo;

/**
 * Created by enaimark on 18.07.2016.
 */
public class TaskFive {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        if (x < 0 && y < 0) {
            x = Math.abs(x);
            y = Math.abs(y);

            System.out.println(x);
            System.out.println(y);

        } else if (x < 0 || y < 0) {
            x += 0.5;
            y += 0.5;

            System.out.println(x);
            System.out.println(y);
        }
    }
}
