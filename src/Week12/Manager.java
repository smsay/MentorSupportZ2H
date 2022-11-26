package Week12;

public class Manager extends Member{
    private String group;

    public Manager(String name, int age, String address, int salary, String group) {
        super(name, age, address, salary);
        this.group = group;
    }
}