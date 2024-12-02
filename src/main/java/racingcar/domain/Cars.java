package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public void askGoForward(int i) {
    }

    public List<String> findWinners(int maxForward) {
        List<String> carNames = new ArrayList<>();
        for (Car car : cars) {
            if (car.isSamePosition(maxForward)) {
                carNames.add(car.getName());
            }
        }
        return carNames;
    }

    public int findMaxForward() {
        int maxForward = 0;
        for (Car car : cars) {
            maxForward = car.calculateMaxForward(maxForward);
        }
        return maxForward;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Cars cars1)) {
            return false;
        }
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
