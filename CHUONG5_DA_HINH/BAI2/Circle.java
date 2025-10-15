package CHUONG5_DA_HINH.BAI2;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        super("Hình Tròn");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}