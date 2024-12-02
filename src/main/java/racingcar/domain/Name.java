package racingcar.domain;

import java.util.Objects;
import racingcar.constants.ExceptionMessage;

public class Name {
    private static final int MAXIMUM_NAME_LENGTH = 5;

    private final String text;

    public Name(final String text) {
        checkLength(text);
        this.text = text;
    }

    private void checkLength(String text) {
        if (text.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_CAR_NAME_LENGTH.valueOf());
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Name name)) {
            return false;
        }
        return Objects.equals(text, name.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return text;
    }
}
