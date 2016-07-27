package ru.Tsystems.LectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Dog {
    private String dogName;
    private int age;
    private String breed;
    private Owner owner;

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

    void setOwner(Owner newOwner) {
        if (owner != null) {
            System.out.println("Unable to add " + newOwner.getName() + " as an owner: " + this.dogName + " already has an owner");
        } else {
            owner = newOwner;
        }
    }

    Owner getOwner() {
        return owner;
    }

    void bark() {
        System.out.println(this.getDogName() + " said bark, bark!");
    }

}