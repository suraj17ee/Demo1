import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Car {
    private String brandName;
    private String carModel;
    private String carEngineType;

    public Car(String brandName, String carModel, String carEngineType) {
        this.brandName = brandName;
        this.carModel = carModel;
        this.carEngineType = carEngineType;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarEngineType() {
        return carEngineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngineType='" + carEngineType + '\'' +
                '}';
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Car car1 = new Car("TATA", "Punch", "petrol");
        Car car2 = new Car("HUNDAI", "Dexter", "petrol");
        Car car3 = new Car("HONDA", "Accord", "diesel");
        Car car4 = new Car("TATA", "Herier", "petrol");
        Car car5 = new Car("TATA", "Curvv", "diesel");
        List<Car> cars = List.of(car1, car2, car3, car4, car5);
        cars.stream().filter(c -> Objects.equals(c.getCarEngineType(), "diesel"))
                .forEach(car -> System.out.println(car.getCarModel()));
        System.out.println("Thank you");
    }
}
