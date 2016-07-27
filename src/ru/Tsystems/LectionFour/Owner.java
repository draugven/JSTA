package ru.Tsystems.LectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Owner {
    private String name;
    private String[] dogs = new String[5];

    //set owner's name
    void setName(String setName) {
        name = setName;
    }

    //get owner's name
    String getName() {
        return name;
    }

    //add a dog
    private int nextIndex = 0; //keep track of elements in the dogs array
    void setDogs(Dog dog) {
        if (nextIndex < dogs.length) {
            if (dog.getHasOwner()) {
                    System.out.println("Cannot add " + dog.getDogName() + " to " + this.getName() + ": already has an owner");
                } else {
                    dogs[nextIndex] = dog.getDogName();
                    nextIndex++;
                    dog.setOwnerName(this.name);
                }
            } else {
            System.out.println("Cannot add " + dog.getDogName() + ": " + this.getName() + " already has the maximum of 5 dogs");
            }
    }

    //get the array of dogs
    String[] getDogs() {
        return dogs;
    }
}