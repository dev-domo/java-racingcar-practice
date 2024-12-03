package racingcar.domain;

import java.util.Objects;

public class Position {
    private static final String FORWARD_SIGN = "-";

    private int number;

    public Position(int number) {
        this.number = number;
    }

    public Position increase() {
        number++;
        return this;
    }

    public int getLargerValue(int maxForward) {
        return Math.max(number, maxForward);
    }

    public boolean isSameValue(int maxForward) {
        return number == maxForward;
    }

    public String currentState() {
        return FORWARD_SIGN.repeat(number);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Position position)) {
            return false;
        }
        return number == position.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
