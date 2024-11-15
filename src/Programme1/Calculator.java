package Programme1;

public class Calculator {
    // method to calculate addition
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is :" + (a + b));
    }

    // method to calculate substation
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is :" + (a - b));
    }

    // method to calculate Division
    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is :" + (a / b));
    }

    // method to calculate Multiplication
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is :" + (a * b));
    }


    // Method to calculate a result
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else
            System.out.println("Invalid input !!!"); // Warning msg for an invalid entry
    }

}
