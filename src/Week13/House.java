package Week13;
import java.util.ArrayList;
import java.util.Arrays;


    public abstract class House {
        String name;

        public House(String name){
            this.name = name;
        }

        public abstract double getArea();

        String getName(){
            return name;
        }

        @Override
        public String toString() {
            return name + " ";
        }
    }

    class Square extends House {
        int side;

        public Square(String name, int side) {
            super(name);
            this.side = side;
        }

        @Override
        public double getArea() {
            return side*side;
        }

    }

    class Rectangle extends House {

        int width, length;

        public Rectangle(String name, int width, int length) {
            super(name);
            this.width = width;
            this.length = length;
        }

        @Override
        public double getArea() {
            return width*length;
        }
    }

    class Circle extends House {
        int radius;

        public Circle(String name, int radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    class ShapeTest {
        public static void main(String[] args) {

//        System.out.println("square : " + isAreaEnough(new Square(20), 300));
//        System.out.println("circle : " + isAreaEnough(new Circle(20), 300));

            ArrayList<House> list = new ArrayList<>(Arrays.asList(
                    new Square("SquareHouse-1", 20),
                    new Square("SquareHouse-2",25),
                    new Square("SquareHouse-3",30),

                    new Rectangle("RectangleHouse-1",30, 20),
                    new Rectangle("RectangleHouse-2",20, 25),

                    new Circle("CircleHouse-1", 15),
                    new Circle("CircleHouse-2", 20),
                    new Circle("CircleHouse-2", 10)));

            System.out.println(filterProperties(list, 600));
        }

        public static ArrayList<House> filterProperties (ArrayList<House> houses, int minArea){
            ArrayList<House> result = new ArrayList<>();
            for (House house : houses) {
                if (isAreaEnough(house, minArea)) {
                    result.add(house);
                }
            }
            return result;
        }

        public static boolean isAreaEnough(House house, int minArea){
            return house.getArea() >= minArea;
        }
    }

