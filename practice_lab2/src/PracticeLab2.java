public class PracticeLab2 {
	public static void main(String s[]) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 60, 6, 10, 10};

        int addition = numbers[0] + numbers[1];
        int subtraction = numbers[2] - numbers[3];
        int multiplication = numbers[4] * numbers[5];
        double division = numbers[6] / numbers[7];
        int modulus = numbers[8] % numbers[9];

        System.out.println("addition: " + addition);
        System.out.println("subtraction: " + subtraction);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);
        System.out.println("modulus: " + modulus);

        for (int i = 0; i < numbers.length - 1; i++){
           String output = numbers[i + 1] >= numbers[i] ? (numbers[i + 1] > numbers[i] ? "greater than" : "equal") : "less than";
           System.out.println(numbers[i + 1] + " " + output + " " + numbers[i]);
        }
	}
}

