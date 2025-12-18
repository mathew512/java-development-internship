public class ProgrammingSection {
    // Basic Calculator methods

    // 1. Add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // 2. Subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // 3. Multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // 4. Divide two numbers (handle division by zero)
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Test the calculator
        System.out.println("Addition: 5 + 3 = " + add(5, 3));
        System.out.println("Subtraction: 5 - 3 = " + subtract(5, 3));
        System.out.println("Multiplication: 5 * 3 = " + multiply(5, 3));
        System.out.println("Division: 6 / 2 = " + divide(6, 2));

        // Test division by zero
        try {
            System.out.println("Division: 5 / 0 = " + divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}