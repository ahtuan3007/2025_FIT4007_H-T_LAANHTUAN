package CHUONG5_DA_HINH.BAI1;
import java.util.ArrayList;
import java.util.List;

public class CHUONG5_BAI1_DA_HINH_DONG {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Nguyễn Văn A", "FT001", 15000000.0));
        employees.add(new PartTimeEmployee("Trần Thị B", "PT002", 50000.0, 160));
        employees.add(new FullTimeEmployee("Lê Văn C", "FT003", 22000000.0));
        employees.add(new PartTimeEmployee("Phạm Thị D", "PT004", 65000.0, 100));

        System.out.println("----- BẢNG TÍNH LƯƠNG NHÂN VIÊN -----");
        double totalSalary = 0;

        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            totalSalary += salary;

            System.out.printf("%s, Lương: %,.0f VNĐ%n", emp.toString(), salary);
        }

        System.out.println("------------------------------------");
        System.out.printf("TỔNG LƯƠNG PHẢI CHI TRẢ: %,.0f VNĐ%n", totalSalary);
        System.out.println("------------------------------------");
    }
}