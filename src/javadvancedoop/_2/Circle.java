package javadvancedoop._2;

public class Circle extends Shape{
    public Circle(double radius) {
        super(radius, radius);
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
