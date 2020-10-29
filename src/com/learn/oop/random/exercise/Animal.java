package com.learn.oop.random.exercise;

public class Animal {


    public String yourType() {
        return "I'm a dog";
    }

    public String yourNameIs(String name) {
        return "My name is " + name;
    }

    public String yourBreedIs(Breed breed) {
        return "I guess my breed is " + breed;
    }

    public int yourAgeIs(int age) {
        return age;
    }

    boolean isAPuppy(int age) {
        if (age > 5) {
            return true;
        } else {
            return false;
        }
    }

    public double YourWeightIs (double weight) {
        return weight;

    }

    public String YourColorIs (DogColor color) {
        return "Your color is " + color;
    }

    public boolean IsFat (int weightApprox) {
        if (weightApprox >= 5) {
            return true; }
        else { return false;
        }

    }

}

