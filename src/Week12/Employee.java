package Week12;

public class Employee  extends Member{
    private String type;

    public Employee(String name, int age, String address, int salary, String type) {
        super(name, age, address, salary);
        this.type = type;
    }
}