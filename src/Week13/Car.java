package Week13;

public class Car {
    private int fuel;
    public Car(){
        fuel=0;
    }
    public Car(int g){
        fuel=g;

    }
    public void addFuel(){fuel++;}
    public void display(){
        System.out.print(fuel+ " ");
    }

    public static void main(String[] args) {
        Car car =new Car(5);
        Car fastCar=new RaceCar(5);
        car.display();
        car.addFuel();
        car.display();
        fastCar.display();
        fastCar.addFuel();
        fastCar.display();
    }
}
class RaceCar extends Car{
    public RaceCar(int g){
        super(2*g);
    }
}