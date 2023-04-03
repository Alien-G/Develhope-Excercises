package Exercises;

public class BadgeTester {

    public static void main (String[] args){

        Employee employee1 = new Employee("Gino", "Pino", "Via Roma, n. 145");
        Employee employee2 = new Employee("Francesco", "Bianchi", "Via V. Veneto, n. 4");

        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();
        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}