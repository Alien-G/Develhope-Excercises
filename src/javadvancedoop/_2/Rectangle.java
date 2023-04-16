package javadvancedoop._2;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
