package JavaInProduction._1;

public record Person(String name, int age, String address) {

    @Override
    public String toString() {
        return String.format("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
};
