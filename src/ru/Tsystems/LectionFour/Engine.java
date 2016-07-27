package ru.Tsystems.LectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
public class Engine {
    public static void main (String[] args) {

        Dog sparky = new Dog();

        sparky.setDogName("Sparky");
        sparky.setAge(5);
        sparky.setBreed("UNKNOWN");

        Dog buddy = new Dog();

        buddy.setDogName("Buddy");
        buddy.setAge(3);
        buddy.setBreed("HUSKY");

        Dog daisy = new Dog();

        daisy.setDogName("Daisy");
        daisy.setAge(4);
        daisy.setBreed("GERMAN SHEPHERD");

        Dog max = new Dog();

        max.setDogName("Max");
        max.setAge(3);
        max.setBreed("UNKNOWN");

        Dog charlie = new Dog();

        charlie.setDogName("Charlie");
        charlie.setAge(2);
        charlie.setBreed("PUG");

        Dog edward = new Dog();

        edward.setDogName("Edward");
        edward.setAge(7);
        edward.setBreed("UNKNOWN");

//        System.out.println("Sparky: name=" + sparky.getDogName() + "; age=" + sparky.getAge() + "; breed=" + sparky.getBreed());

        Owner bill = new Owner();

        bill.setName("Bill");
        /*bill.setDogs(sparky);
        bill.setDogs(buddy);
        bill.setDogs(daisy);
        bill.setDogs(max);
        bill.setDogs(charlie);
        bill.setDogs(edward);*/

        Owner gary = new Owner();

        gary.setName("Gary");
        gary.setDogs(buddy);

        System.out.print(bill.getName() + "'s dogs are: ");
        if(Print.getIsEmpty(bill)) {
            System.out.print("no dogs found");
        } else {
            Print.printDogsList(bill);
        }

        System.out.println("");

        System.out.print(gary.getName() + "'s dogs are: ");
        if(Print.getIsEmpty(gary)) {
            System.out.print("no dogs found.");
        } else {
            Print.printDogsList(gary);
        }
    }
}

class Print {
    private static Boolean isEmpty = true;

    static Boolean getIsEmpty(Owner owner) {
        for (int i = 0; i < owner.getDogs().length; i++) {
            if (owner.getDogs()[i] != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    static void printDogsList(Owner owner) {
        for (int i = 0; i < owner.getDogs().length; i++) {
            if (owner.getDogs()[i] != null) {
                if (i < owner.getDogs().length - 1) {
                    System.out.print(owner.getDogs()[i] + ", ");
                } else {
                    System.out.print(owner.getDogs()[i] + ".");
                }
            }
        }
    }
}