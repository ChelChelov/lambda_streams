package lambda.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {

    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = createThreeCars(() -> new Car("Toyota", "black", 3.5));
        System.out.println("Our cars: " + cars);
    }
}
