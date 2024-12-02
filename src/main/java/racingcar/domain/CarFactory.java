package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static Cars createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        carNames.forEach(name -> cars.add(createCar(name)));
        return new Cars(cars);
    }

    private static Car createCar(String name) {
        return new Car(name);
    }
}
