package ru.Tsystems.lectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Owner {
    private String name;
    private Dog[] dogs = new Dog[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    /**
     * keep track of elements in the dogs array
     */
    private int nextIndex = 0;

    public void addDog(Dog dog) {
        if (nextIndex < dogs.length) {
            if (dog.hasOwner()) {
                System.out.println("Cannot add " + dog.getName() + " to " + getName() + ": already has an owner");
            } else {
                dogs[nextIndex++] = dog;
                dog.setOwner(this);
            }
        } else {
            System.out.println("Cannot add " + dog.getName() + ": " + getName() + " already has the maximum of 5 dogs");
        }
    }
}