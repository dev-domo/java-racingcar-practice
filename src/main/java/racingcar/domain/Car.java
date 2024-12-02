package racingcar.domain;

import java.util.Objects;

public class Car {
    private static final int DEFAULT_POSITION = 0;
    private static final int FORWARD_STANDARD = 4;
    private static final String NAME_POSITION_SEPARATOR = " : ";

    private final Name name;
    private Position position;

    public Car(final String name) {
        this(name, DEFAULT_POSITION);
    }

    public Car(final String name, int position) {
        this(new Name(name), position);
    }

    public Car(final Name name, int position) {
        this(name, new Position(position));
    }

    public Car(final Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public Car move(int step) {
        if (step >= FORWARD_STANDARD) {
            position.increase();
        }
        return this;
    }

    public int calculateMaxForward(int maxForward) {
        return position.getLargerValue(maxForward);
    }

    public boolean isSamePosition(int maxForward) {
        return position.isSameValue(maxForward);
    }

    public String getName() {
        return name.toString();
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

    @Override
    public String toString() {
        return name + NAME_POSITION_SEPARATOR + position.currentState();
    }
}
