package com.capitalone.softwarecraftsmanship.tdd;

/**
 * Created by mbh475 on 4/12/17.
 */
public class Application {
    private final String owner;
    private final String species;
    private final String pet;
    private final int age;
    private final int numCCs;

    public Application(String owner, String species, String pet, int age, int numCCs) {
        this.owner = owner;
        this.species = species;
        this.pet = pet;
        this.age = age;
        this.numCCs = numCCs;
    }

    public String getOwner() {
        return owner;
    }

    public String getSpecies() {
        return species;
    }

    public String getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public int getNumCCs() {
        return numCCs;
    }
}
