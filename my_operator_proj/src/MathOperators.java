public class MathOperators {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("Mathematical operators with numbers " + num1 + " and " + num2 );

        // Addition
        System.out.println("Addition: + operator " + (num1 + num2) );

        // Subtraction
        System.out.println("Subtraction: - operator " + (num1 - num2) );

        // Multiplication
        System.out.println("Multiplication: * operator " + (num1 * num2) );

        // Division
        System.out.println("Division: / operator " + (num1 / num2) );

        // Modulus (remainder)
        System.out.println("Modulus: % operator " + (num1 % num2) );

        // Use double for more precise division
        double num3 = 20.0;
        double num4 = 7.0;
        System.out.println("Precise Division: " + (num3 / num4));
    }
}

echo "# ibm_java" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/maharajsandip/ibm_java.git
git push -u origin main