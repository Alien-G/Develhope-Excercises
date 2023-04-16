package javadvancedoop._1;

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
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Dog borderCollie = new Dog("Border Collie", 0.53, 20);
        String newDog = "Dog Breed: " + borderCollie.getBreed() + "\nDog Height: " + borderCollie.getHeight() + "\nDog Weight: " + borderCollie.getWeight();
        System.out.println(newDog);

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Bird crow = new Bird(0.43,0.69,0.15);
        Fish betta = new Fish(0.76,0.5,"Betta");

        String newBird = "Bird Wingspan: " + crow.getWingSpan() + "\nBird Height: " + crow.getHeight() + "\nBird Weight: " + crow.getWeight();
        System.out.println(newBird);

        String newFish = "Fish Species: " + betta.getSpecies() + "\nFish Height: " + betta.getHeight() + "\nFish Weight: " + betta.getWeight();
        System.out.println(newFish);

    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Dog borderCollie = new Dog("Border Collie", 0.53, 20);
        Bird crow = new Bird(0.43,0.69,0.15);
        Fish betta = new Fish(0.76,0.5,"Betta");

        double dogSpeed = borderCollie.runSpeedMeterPerSecond();
        double birdSpeed = crow.flySpeedMetersPerSecond();
        double fishSpeed = betta.swimSpeedMetersPerSecond();

        if(dogSpeed > birdSpeed && dogSpeed > fishSpeed){
          System.out.println("The dog is the fastest animal, with a speed of " + borderCollie.runSpeedMeterPerSecond() + "m/s.");
        } else if(birdSpeed > dogSpeed && birdSpeed > fishSpeed){
            System.out.println("The bird is the fastest animal, with a speed of " + crow.flySpeedMetersPerSecond() + "m/s.");
        } else if(fishSpeed > dogSpeed && fishSpeed > birdSpeed){
            System.out.println("The fish is the fastest animal, with a speed of " + betta.swimSpeedMetersPerSecond() + "m/s.");

        }
    }
}