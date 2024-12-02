package racingcar.domain;

import java.util.Objects;
import racingcar.constants.ExceptionMessage;

public class Car {
    private static final int DEFAULT_POSITION = 0;
    private static final int MAXIMUM_NAME_LENGTH = 5;
    private static final int FORWARD_STANDARD = 4;

    private final String name;
    private int position;

    public Car(final String name) {
        this(name, DEFAULT_POSITION);
    }

    public Car(final String name, int position) {
        checkNameLength(name);
        this.name = name;
        this.position = position;
    }

    private void checkNameLength(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_CAR_NAME_LENGTH.valueOf());
        }
    }

    public Car move(int step) {
        if (step >= FORWARD_STANDARD) {
            position += step;
        }
        return this;
    }

    public int calculateMaxForward(int maxForward) {
        return Math.max(position, maxForward);
    }

    public boolean isSamePosition(int maxForward) {
        return position == maxForward;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Car car)) {
            return false;
        }
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
