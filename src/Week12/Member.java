package Week12;

public class Member {

    private String name;
    private int age;
    private String address;
    private int salary;

    public Member(String name, int age, String address, int salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println(salary);
    }
}
