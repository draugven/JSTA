package ru.Tsystems.lectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
public class Engine {
    public static void main(String[] args) {

        Dog sparky = new Dog();

        sparky.setName("Sparky");
        sparky.setAge(5);
        sparky.setBreed("UNKNOWN");

        Dog buddy = new Dog();

        buddy.setName("Buddy");
        buddy.setAge(3);
        buddy.setBreed("HUSKY");

        Dog daisy = new Dog();

        daisy.setName("Daisy");
        daisy.setAge(4);
        daisy.setBreed("GERMAN SHEPHERD");

        Dog max = new Dog();

        max.setName("Max");
        max.setAge(3);
        max.setBreed("UNKNOWN");

        Dog charlie = new Dog();

        charlie.setName("Charlie");
        charlie.setAge(2);
        charlie.setBreed("PUG");

        Dog edward = new Dog();

        edward.setName("Edward");
        edward.setAge(7);
        edward.setBreed("UNKNOWN");

//        System.out.println("Sparky: name=" + sparky.getName() + "; age=" + sparky.getAge() + "; breed=" + sparky.getBreed());

        Owner bill = new Owner();

        bill.setName("Bill");
        /*bill.addDog(sparky);
        bill.addDog(buddy);
        bill.addDog(daisy);
        bill.addDog(max);
        bill.addDog(charlie);
        bill.addDog(edward);*/

        Owner gary = new Owner();

        gary.setName("Gary");
        gary.addDog(buddy);

        Print.printDogsListForOwner(bill);

        Print.printDogsListForOwner(gary);

        buddy.bark();
    }
}