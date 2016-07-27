package ru.Tsystems.LectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Owner {
    private String name;
    private String[] dogs = new String[5];

    void setName(String setName) {
        name = setName;
    }

    String getName() {
        return name;
    }

    private int nextIndex = 0; //keep track of elements in the dogs array
    void addDog(Dog dog) {
        if (nextIndex < dogs.length) {
            if (dog.getHasOwner()) {
                    System.out.println("Cannot add " + dog.getDogName() + " to " + this.getName() + ": already has an owner");
                } else {
                    dogs[nextIndex] = dog.getDogName();
                    nextIndex++;
                    dog.setOwner(this);
                }
            } else {
            System.out.println("Cannot add " + dog.getDogName() + ": " + this.getName() + " already has the maximum of 5 dogs");
            }
    }

    String[] getDogs() {
        return dogs;
    }
}