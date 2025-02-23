package oop_questions;

public class Person {
	public String name;
    public int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Shu", 25);
        Person p2 = new Person("Luca", 23);
        Person p3 = new Person("Vox", 30);
        Person p4 = new Person("Mysta", 23);
        Person p5 = new Person("Ike", 29);

        System.out.println(p1.name + " is " + p1.age);
        System.out.println(p2.name + " is " + p2.age);
        System.out.println(p3.name + " is " + p3.age);
        System.out.println(p4.name + " is " + p4.age);
        System.out.println(p5.name + " is " + p5.age);
    }
}
