package _4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 24;
        System.out.println("I am " + myAge + " years old.");
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myInitial = 'G';
        int myAge = 24;
        System.out.println("My Age = " + myAge +", My Initial = " + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // declaring the variable hasEatenLunch as boolean, false in this instance.

        boolean hasEatenLunch = false;

        // declaring the variable lunchCost as a double.

        double lunchCost = 5.99;

        // printing out statements regarding the cost of lunch and whether they have eaten lunch or not.
        // referring to the variables declared above.

        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
