package Week12;

public abstract class Parent {

    abstract void a_method();

    public void n_method(){
        System.out.println("This is a normal method");
    }

}

class Child extends Parent{

    @Override
    void a_method() {
        System.out.println("This is the body of abstract method");
    }
}

class Main{
    public static void main(String[] args) {

        Parent child = new Child();
        child.a_method();
        child.n_method();
    }
}
