package javaadvanced._6;

public class Exercises {
    public static void main(String[] args) throws InterruptedException {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();

    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        enum Days {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY;
        }

        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");


        // Your code here
        enum Seasons {
            SPRING("March", "June"),
            SUMMER("June", "September"),
            FALL("September", "December"),
            WINTER("December", "March");

            private String startingMonth;
            private String endingMonth;
            Seasons(String startingMonth, String endingMonth) {
                this.startingMonth = startingMonth;
                this.endingMonth = endingMonth;
            }
            private static String dateRange(Seasons season) {
                return season.startingMonth + " - " + season.endingMonth;
            }
        }
        System.out.println("SPRING: " + Seasons.dateRange(Seasons.SPRING));
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() throws InterruptedException {
        System.out.println("\nExercise 3: ");
        // Your code here
        enum TrafficLight {
            RED,
            YELLOW,
            GREEN;
        }

        TrafficLight trafficLightColour = TrafficLight.RED;

        switch (trafficLightColour) {
            case RED:
                System.out.println("STOP!");
                Thread.sleep(18000);
                trafficLightColour = TrafficLight.GREEN;
                break;
            case GREEN:
                System.out.println("YOU CAN GO!");
                Thread.sleep(18000);
                trafficLightColour = TrafficLight.YELLOW;
                break;
            case YELLOW:
                System.out.println("SLOW DOWN!");
                Thread.sleep(15000);
                trafficLightColour = TrafficLight.RED;
                break;
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        enum Days {
            MONDAY(false),
            TUESDAY(false),
            WEDNESDAY(false),
            THURSDAY(false),
            FRIDAY(false),
            SATURDAY(true),
            SUNDAY(true);
            private boolean isWeekend;
            Days(boolean isWeekend) {
                this.isWeekend = isWeekend;
            }
        }

        for (Days day : Days.values()) {
            if
            (day.isWeekend){
                System.out.println("It's " + day + ". Enjoy your weekend!");
            } else {
                System.out.println(day + " is a weekday.");
            }
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        enum Operator {
            ADD,
            SUBTRACT,
            MULTIPLY,
            DIVIDE;

            public static void operation(double num1, double num2, Operator operator) {
                switch (operator) {
                    case ADD:
                        System.out.println("Total: " + (num1 + num2));
                        break;
                    case SUBTRACT:
                        System.out.println("Total: " + (num1 - num2));
                        break;
                    case MULTIPLY:
                        System.out.println("Total: " + (num1 * num2));
                        break;
                    case DIVIDE:
                        System.out.println("Total: " + (num1 / num2));
                        break;
                }
            }
        }
        double num1 = 5;
        double num2 = 2;

        Operator operator = Operator.MULTIPLY;
        Operator.operation(num1, num2, operator);
    }
}


