package com.learning.designpatterns.creational.builderPattern;

public class Dog {

   private String name;   //optional
   private String gender;  //cannot change
   private String breed;   //cannot change
   private double price;

    // Private constructor to enforce object creation through the Builder
   private Dog(DogBuilder builder){
       this.name = builder.getName();
       this.breed = builder.getBreed();
       this.gender = builder.getGender();
       this.price = builder.getPrice();
   }

    // Static nested Builder class
    public static class DogBuilder{
       private String name;
       private String gender;
       private String breed;
       private double price;

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;   //Returning the builder object for chaining
            //basically with this line we can call the multiple setters with single, continues line of code
            // for ex:
            //      Dog dog = new Dog.DogBuilder()
            //              .setGender("Male")
            //              .setBreed("German Shepard")
            //              .setPrice(1000)
            //              .setName("Bruno")
            //              .build();

        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        //Build method to create the Dog object
        public Dog build(){
            return new Dog(this);
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
              "name='" + name + '\'' +
              ", gender='" + gender + '\'' +
              ", breed='" + breed + '\'' +
              ", price=" + price +
              '}';
    }
}
