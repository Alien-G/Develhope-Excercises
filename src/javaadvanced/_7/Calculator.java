package javaadvanced._7;

// You can change any code in this class if you think there is a bug!
public class Calculator {
    public int add(int a, int b) {
        return a + b; // was wrong had to change - with +
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    } // was wrong had to change a with b

    public int divide(int a, int b) {
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    } //was wrong had to switch base with exponent
}

