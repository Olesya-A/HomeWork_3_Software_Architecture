package DIP;

public class MainDIP {
    public static void main(String[] args) {
        Car car = new Car(new PatrolEngine());
        car.start();
        car = new Car(new DieselEngine());
        car.start();
    }
}
