package com.learning.designpatterns.creational.builderPattern;

public class DogDriver {

    public static void main(String[] args) {

//        Dog dog = new Dog();
//        Dog.DogBuilder builder = dog.new DogBuilder();
        // by using static

        Dog dog = new Dog.DogBuilder()
              .setGender("Male")
              .setBreed("German Shepard")
              .setPrice(1000)
              .setName("Bruno")
              .build();

        Dog dog1 = new Dog.DogBuilder()
              .setGender("Male")
              .setBreed("pug")
              .setPrice(10800)
              .build();

        Dog dog2 = new Dog.DogBuilder()
              .setName("dolly")
                    .build();

        System.out.println(dog1);
        System.out.println(dog);
        System.out.println(dog2);


    }

    /**
     * -> Use the Builder pattern to get rid of a “telescoping constructor”.
     */
}
