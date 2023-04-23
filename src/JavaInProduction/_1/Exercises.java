package JavaInProduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        double x = Math.random() * 100;
        String result = x >= 50 ? "is greater than or equal to 50." : "is less than 50.";
        System.out.println("x= " + x + " " + result);

    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Person person = new Person("Mario Rossi", 47, "Via Roma n.134");
        System.out.println(person);


    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        BigInteger bigNum = new BigInteger("42000000000000000000000000");
        BigDecimal bigDecimal = new BigDecimal("6900000000000000000000.69");

        BigInteger bigNumResult = bigNum.divide(BigInteger.valueOf(3));
        BigDecimal bigDecimalResult = bigDecimal.divide(BigDecimal.valueOf(Math.PI), RoundingMode.HALF_UP); // I had to look this up cause it kept throwing an error when I ran the code.

        System.out.println("BigNum result: " + bigNumResult);
        System.out.println("BigDecimal result: " + bigDecimalResult);
    }
}
