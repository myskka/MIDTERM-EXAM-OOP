package oop_questions;

public class Rectangle {
	public double width, height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public static void main(String[] args) {
        Rectangle vanitas = new Rectangle(5, 10);

        System.out.println("Area: " + (vanitas.width * vanitas.height));
        System.out.println("Perimeter: " + (2 * (vanitas.width + vanitas.height)));
    }
}