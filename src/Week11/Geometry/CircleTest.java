package Week11.Geometry;

public class CircleTest {

    public static void main(String[] args) {

        CircleImpl circle1 = new CircleImpl(-8);
        System.out.println(circle1.getRadius());
        circle1.setRadius(-15);
        circle1.setRadius(15);
        System.out.println(circle1.getRadius());
        System.out.println(CircleImpl.getNumberOfCircle());

        CircleImpl circle2 = new CircleImpl(5);
        System.out.println(CircleImpl.getNumberOfCircle());
        System.out.println(circle2.calculateArea());
        System.out.println(circle2.calculatePerimeter());

        CircleImpl circle3 = new CircleImpl();
        circle3.setRadius(-6);
        System.out.println(circle3.getRadius());
        circle3.setRadius(11);
    }
}
