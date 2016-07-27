package ru.Tsystems.LectionFour;

/**
 * Created by Elizaveta Naimark on 28.07.2016.
 */
public class Print {
    private static Boolean isEmpty = true;

    private static Boolean getIsEmpty(Owner owner) {
        for (int i = 0; i < owner.getDogs().length; i++) {
            if (owner.getDogs()[i] != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    private static void printNoDogs() {
        System.out.print("no dogs found.");
    }

    private static void printDogsList(Owner owner) {
        for (int i = 0; i < owner.getDogs().length; i++) {
            if (owner.getDogs()[i] != null) {
                System.out.print(owner.getDogs()[i].getDogName());
                if (owner.getDogs()[i + 1] != null) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
            }
        }
    }

    static void printDogsListForOwner(Owner owner) {
        System.out.print(owner.getName() + "'s dogs are: ");
        if (Print.getIsEmpty(owner)) {
            Print.printNoDogs();
        } else {
            Print.printDogsList(owner);
        }
        System.out.println("");
    }
}
