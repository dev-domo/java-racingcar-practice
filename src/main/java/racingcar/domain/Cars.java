package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

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
}
