//import Scanner to read user input
import java.util.Scanner;

public class AreaCalculator {

	//Add the methods to calculate area here
    private static float pi = 3.142f;

    private static float circle(float radius) {
        return pi * radius * radius;
    }

    private static float square(float length) {
        return length * length;
    }

    private static float rectangle(float length, float breadth) {
        return length * breadth;
    }

    private static float sphereVolume (float radius) {
        return (4 * pi * radius * radius * radius) / 3;
    }

    private static float cubeVolume (float length) {
        return length * length * length;
    }

    private static float cuboidVolume (float length, float width, float height) {
        return length * width * height;
    }


	public static void main(String s[]) {
		System.out.println("Welcome to the area calculator!");

		while (true) {
			//Add the menu to get user input and invoke method here
            System.out.println("\nEnter 1 for area of circle\n" +
                                "Enter 2 for area of square\n" +
                                "Enter 3 for area of rectangle\n" +
                                "Enter 4 for volume of sphere\n" +
                                "Enter 5 for volume of cube\n" +
                                "Enter 6 for volume of cuboid\n" +
                                "Enter any other number to exit.");

			Scanner scanner = new Scanner(System.in);
			int choice = Integer.parseInt(scanner.nextLine());

			if (choice == 1) {
				System.out.println("Enter the radius of the circle");
				float radius = Float.parseFloat(scanner.nextLine());
				System.out.println("The area of circle of radius " + radius + " is " + circle(radius));
			} else if (choice == 2) {
				System.out.println("Enter the length of the square");
				float length = Float.parseFloat(scanner.nextLine());
				System.out.println("The area of square of side length " + length + " is " + square(length));
			} else if (choice == 3) {
				System.out.println("Enter the length of the rectangle");
				float length = Float.parseFloat(scanner.nextLine());
				System.out.println("Enter the breadth of the rectangle");

				float breadth = Float.parseFloat(scanner.nextLine());
				System.out.println("The area of rectangle of length " + length +
									" and breadth " + breadth + " is " + rectangle(length,breadth));
			} else if (choice == 4) {
                System.out.println("Enter the radius of the sphere");
                float radius = Float.parseFloat(scanner.nextLine());

                System.out.println("The volumne of the sphere of radius " + radius + " is " + sphereVolume(radius));
            } else if (choice == 5) {
                System.out.println("Enter the length of the cube");
                float length = Float.parseFloat(scanner.nextLine());

                System.out.println("The volume of cube of side length " + length + " is " + cubeVolume(length));
            } else if (choice == 6) {
                System.out.println("Enter the length of the cuboid");
                float length = Float.parseFloat(scanner.nextLine());

                System.out.println("Enter the width of the cuboid");
                float width = Float.parseFloat(scanner.nextLine());

                System.out.println("Enter the height of the cuboid");
                float height = Float.parseFloat(scanner.nextLine());

                System.out.println("The volume of cuboid of side length " + length + " width " + width +
                                    " height " + height + " is " + cuboidVolume(length, width, height));
            } else {
				// System.out.println("Invalid choice");
				break;
			}

		}
	}
}
