package Week11.Geometry;


    class Human {
        public void eat() {
            System.out.print("Human is eating ");
        }
    }

    class Boy extends Human {

        public void eat() {
            System.out.print("Boy is eating ");
        }

        public static void main(String[] args) {

            Boy obj = new Boy();
            obj.eat();
            Human hum = new Human();
            hum.eat();
        }
    }

