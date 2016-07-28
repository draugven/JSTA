package ru.Tsystems.lectionFour;

/**
 * Created by enaimark on 27.07.2016.
 */
class Dog {
    private String name;
    private int age;
    private String breed;
    private Owner owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner newOwner) {
        if (hasOwner()) {
            System.out.println("Unable to add " + newOwner.getName() + " as an owner: " + this.name + " already has an owner");
        } else {
            owner = newOwner;
        }
    }

    public boolean hasOwner() {
        return owner != null;
    }

    /**
     * Dog barks
     */
    void bark() {
        System.out.println(this.getName() + " said bark, bark!");
    }

}