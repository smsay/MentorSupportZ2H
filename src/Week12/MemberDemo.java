package Week12;

public class MemberDemo {

    public static void main(String[] args) {

        var employee = new Employee("Mike",42,"somewhere",10000,"Special");
        var manager = new Manager("John", 45,"Virginia", 12000,"Customer care");

        employee.printSalary();
        manager.printSalary();
    }
}
