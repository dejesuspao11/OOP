package examen_intento_2;

import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle (Ellipse)");
        System.out.println("2. Triangle");
        System.out.println("3. Quadrilateral");
        System.out.println("4. Rectangle");
        System.out.println("5. Square");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Circle (Ellipse)
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of the circle: " + circle.calculateArea());
                break;
            case 2:
                // Triangle
                System.out.print("Enter the three side lengths of the triangle: ");
                double sideA = scanner.nextDouble();
                double sideB = scanner.nextDouble();
                double sideC = scanner.nextDouble();
                Triangle triangle = new Triangle(sideA, sideB, sideC);
                System.out.println("Area of the triangle: " + triangle.calculateArea());
                break;
            // Adding other shapes (quadrilateral, rectangle, square)
            default:
                System.out.println("Invalid choice. Please select a valid shape.");
        }

        scanner.close();
    }
}