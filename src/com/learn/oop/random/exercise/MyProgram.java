package com.learn.oop.random.exercise;

public class MyProgram {
    public static void main(String[] args) {

        Animal myPet = new Animal();

        String type = myPet.yourType();
        System.out.println(type);

        String name = myPet.yourNameIs("Odie");
        System.out.println(name);

        String breed = myPet.yourBreedIs(Breed.dachshund);
        System.out.println(breed);

        int age = myPet.yourAgeIs(4);
        System.out.println("I'm " +age + " years old");

        boolean puppy = myPet.isAPuppy(4);
        System.out.println("It's " + puppy + " that I'm a puppy");

        double weight = myPet.YourWeightIs(3.567);
        System.out.println("According to the scale, my weight is +/- around " + weight + "kgs");

        boolean weightCondition = myPet.IsFat(4);
        System.out.println(weightCondition);


        }





    }

