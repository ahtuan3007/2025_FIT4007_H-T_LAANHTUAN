package CHUONG5_DA_HINH.BAI2;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        super("Hình Chữ Nhật");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}