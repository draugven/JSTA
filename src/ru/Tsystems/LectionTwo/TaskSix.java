package ru.Tsystems.LectionTwo;

/**
 * Created by enaimark on 18.07.2016.
 */
public class TaskSix {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        switch (x) {
            case 1:
            case 2:
            case 3:
                x <<= 1;
                System.out.println(x);
                break;
            case 4:
                x += x >>> 1;
                System.out.println(x);
                break;
            default:
                System.out.println("Unknown command!");
                break;
        }
    }
}
