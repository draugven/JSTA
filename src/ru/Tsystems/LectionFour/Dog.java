package ru.Tsystems.LectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Dog {
    private String dogName; // name
    private int age; // age
    private String breed; // breed
    private Owner owner;
    private Boolean hasOwner = false;


    void setDogName(String setDogName) {
        dogName = setDogName;
    }

    String getDogName() {
        return dogName;
    }

    void setAge (int setAge) {
        age = setAge;
    }

    int getAge() {
        return age;
    }

    void setBreed (String setBreed) {
        breed = setBreed;
    }

    String getBreed() {
        return breed;
    }

    void setOwner(Owner setOwner) {
        if (hasOwner) {
            System.out.println("Unable to add " + setOwner.getName() + " as an owner: " + this.dogName + " already has an owner");
        } else {
            owner = setOwner;
            hasOwner = true;
        }
    }

    Owner getOwner() {
        return owner;
    }

    boolean getHasOwner() {
        return hasOwner;
    }

    void bark() {
        System.out.println(this.getDogName() + " said bark, bark!");
    }

}