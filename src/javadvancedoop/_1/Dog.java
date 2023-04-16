package javadvancedoop._1;

public class Dog extends Animal {

    private String breed;
    public Dog(String breed, double height, double weight) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double runSpeedMeterPerSecond() {
        return getHeight()*2;
    }
}
