package ru.Tsystems.LectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Dog {
    private String dogName; // name
    private int age; // age
    private String breed; // breed
    private String ownerName;
    private Boolean hasOwner = false;


    //set dog's name
    void setDogName(String setDogName) {
        dogName = setDogName;
    }

    //get dog's name
    String getDogName() {
        return dogName;
    }

    //set age
    void setAge (int setAge) {
        age = setAge;
    }

    //get age
    int getAge() {
        return age;
    }

    //set breed
    void setBreed (String setBreed) {
        breed = setBreed;
    }

    //get breed
    String getBreed() {
        return breed;
    }

    //set owner's name
    void setOwnerName(String setOwnerName) {
        if (hasOwner) {
            System.out.println("Unable to add " + setOwnerName + " as an owner: " + this.dogName + " already has an owner");
        } else {
            ownerName = setOwnerName;
            hasOwner = true;
        }
    }

    //get owner's name
    String getOwnerName() {
        return ownerName;
    }

    //get if the dog has an owner
    Boolean getHasOwner() {
        return hasOwner;
    }

    // make the dog bark
    void bark() {
        System.out.println(this.getDogName() + " said bark, bark!");
    }

}