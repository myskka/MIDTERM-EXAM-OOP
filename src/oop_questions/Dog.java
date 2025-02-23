package oop_questions;

public class Dog {
	public String name, breed;

    public Dog(String n, String b) {
        name = n;
        breed = b;
    }

    public void setName(String n) {
        name = n;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Luca", "Golden Retriever");
        Dog d2 = new Dog("Sonny", "Labrador");

        d1.setName("Luca Kaneshiro");
        d2.setBreed("Labrador");

        System.out.println(d1.name + " is a " + d1.breed);
        System.out.println(d2.name + " is a " + d2.breed);
    }
}

