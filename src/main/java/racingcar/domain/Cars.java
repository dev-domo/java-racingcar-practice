package racingcar.domain;

import static racingcar.constants.Separators.JOIN_SEPARATOR;
import static racingcar.constants.Separators.LINE_CHANGE;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import racingcar.domain.strategy.MoveStrategy;

public class Cars {
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public void askGoForward(MoveStrategy moveStrategy) {
        cars.forEach(car -> car.move(moveStrategy.movable()));
    }

    public String findWinners(int maxForward) {
        List<String> carNames = new ArrayList<>();
        cars.stream().filter(car -> car.isSamePosition(maxForward)).forEach(car -> carNames.add(car.getName()));
        return joinCars(carNames);
    }

    private String joinCars(List<String> carNames) {
        return String.join(JOIN_SEPARATOR.valueOf(), carNames);
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

    @Override
    public String toString() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.joining(LINE_CHANGE.valueOf())) + LINE_CHANGE.valueOf();
    }
}
