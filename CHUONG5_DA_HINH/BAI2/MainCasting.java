package CHUONG5_DA_HINH.BAI2;
public class MainCasting {
    public static void main(String[] args) {

        Shape s = new Circle(10.0);

        System.out.println("--- UPCASTING ---");
        System.out.println("Tên hình: " + s.name);
        System.out.printf("Diện tích: %.2f%n", s.getArea());

        System.out.println("-----------------");

        if (s instanceof Circle) {
            Circle c = (Circle) s;

            System.out.println("--- DOWNCASTING ---");
            System.out.printf("Chu vi: %.2f%n", c.getCircumference());
        }
    }
}