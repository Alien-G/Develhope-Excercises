package _17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!

        System.out.println(myBankBalanceEuro += questionableFundsEuro);
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age = byte, although the oldest (verified) person on Earth lived to be 122, so theoretically
     *    somebody could live more than 127 years, in that case short would be the better choice.
     *    2b: The age of a baby in months = byte, at 127 months they would no longer be a baby but a child (10 years old).
     *    2c: Money in a hedgefund in euros = long, as there could be well over 2 billion Euros in a hedgefund, therefore
     *    making int inaccurate for this situation.
     *    2d: Price of a good in euros on amazon.com = float, as we don't need more than 2 decimal places to represent
     *    the cents in the price of a good.
     *    2e: The exact weight of an apple measured by scientific equipment = double, as scientific equipments measures
     *    to a very precise amount, often expressed via numerous decimal places. Although we also have Big Decimal, which
     *    allows precise calculations with exact decimals and without rounding up.
     *    2f: The number of kilometers from any 2 places in the world = Chincha Alta, Peru and Siem Reap, Cambodia are
     *    the world's two furthest cities, and have a distance of 20,010 km between them, therefore we should be safe
     *    using short here!
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate todaysDate = LocalDate.now();
        System.out.println("Current date: " + todaysDate);

        int dayOfMonth = todaysDate.getDayOfMonth();
        System.out.println("Day of month: " + dayOfMonth);

        DayOfWeek dayOfWeek = todaysDate.getDayOfWeek();
        System.out.println("Day of week: " + dayOfWeek);

        int dayOfYear = todaysDate.getDayOfYear();
        System.out.println("Day of year: " + dayOfYear);

        Month month = todaysDate.getMonth();
        System.out.println("Month: " + month);

        int monthValue = todaysDate.getMonthValue();
        System.out.println("Month value: " + monthValue);

        LocalDate newDate = LocalDate.of(2024, 11, 21);
        boolean isBefore = todaysDate.isBefore(newDate);
        boolean isAfter = todaysDate.isAfter(newDate);

        if (isBefore) {
            System.out.println("Today's date " + todaysDate + " is before " + newDate);
        } else if (isAfter) {
        System.out.println("Today's date " + todaysDate + " is after " + newDate);
        }
    }
}