package javaoop._3;

import javaoop._3.Student;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!

        Student student1 = new Student();
        student1.setName("Mario");
        student1.setSurname("Rossi");
        student1.setAge(17);
        student1.setID("001");
        student1.setCodiceFiscale("MRARSS03M14F124");

        System.out.println(
        "Name: " + student1.getNome() + " " + student1.getSurname() +
        " Age: " + student1.getAge() +
        " Student ID: " + student1.getID() +
        " Codice Fiscale: " + student1.getCodiceFiscale());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student2 = new Student();
        student2.setAge(15);
        student2.getAge();
        student2.getAge();
        System.out.println("Accessed age "+ student2.getAgeCounter() + " times.");
    }
}
