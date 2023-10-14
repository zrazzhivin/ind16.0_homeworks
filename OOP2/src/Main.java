import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Аист");
        Car car = new Car("BMW X6", 4);
        Truck truck = new Truck("ГАЗ", 4);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);
    }
}