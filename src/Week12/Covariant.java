package Week12;

public class Covariant {

    class A {
        A get() {
            return this;
        }
    }

    class B1 extends A {
        @Override
       B1 get() {

            return this;
        }

        void message() {

            System.out.println("welcome to covariant return type");
        }
    }
    class SuperClass {
        SuperClass get() {
            System.out.println("SuperClass");
            return this;
        }
    }
  /*  public class Tester extends SuperClass {
        Tester get() {
            System.out.println("SubClass");
            return this;
        }
        public static void main(String[] args) {
            SuperClass tester = new Tester();
            tester.get();
        }
    }*/
}

