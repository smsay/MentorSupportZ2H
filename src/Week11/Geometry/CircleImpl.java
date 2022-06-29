package Week11.Geometry;

public class CircleImpl {

    //define two fields radius(necessary for all calculations)
    //and numberOfCircle(keep the info of how many object was created from this class).
    //decide the type of your variables (static or instance)
    private double radius;
    private static int numberOfCircle;

    //create default and parameterized constructors


    //default constructor should increase the number of object when a new object created
    public CircleImpl() {
        numberOfCircle++;
    }

    //parameterized constructor should increase the number of object when a new object created.
    //and not allowed to initialize object with the radius value lower than Zero.
    public CircleImpl(double radius) {
        setRadius(radius);
        numberOfCircle++;
    }

    //create getter and setter methods for radius.
    //getter
    public double getRadius() {
        return radius;
    }

    //setter if the value of radius is lower than zero keep the previous value.
    public void setRadius(double radius) {//we defined the constraints and make a detailed contract with user.
        if (radius < 0) {
            System.out.println("Radius can not be lower than Zero. Previous value has kept");
            return;
        }
        this.radius = radius;
    }

    //do not allow any object to change value of static variable just get the current
    //value of numberOfCircle. We did not allow to the user changing the value of this static field.
    //it can just be changed while creating objects.
    public static int getNumberOfCircle() {
        return numberOfCircle;
    }

    //calculate area of Circle
    public double calculateArea() {
        if (radius == 0) {
            return 0;
        }
        return radius * radius * Math.PI;
    }

    //calculate perimeter of Circle
    public double calculatePerimeter() {
        if (radius == 0) {
            return 0;
        }
        return 2 * Math.PI * radius;
    }
}
