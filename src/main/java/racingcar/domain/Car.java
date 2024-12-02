package racingcar.domain;

import java.util.Objects;

public class Car {
    private static final int FORWARD_STANDARD = 4;

    private final String name;
    private int position;

    public Car(final String name) {
        this(name, 0);
    }

    public Car(final String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car move(int step) {
        if (step >= FORWARD_STANDARD) {
            position += step;
        }
        return this;
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
