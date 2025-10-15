package CHUONG5_DA_HINH.BAI1;

public class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double calculateSalary() {
        return 0.0;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name;
    }
}