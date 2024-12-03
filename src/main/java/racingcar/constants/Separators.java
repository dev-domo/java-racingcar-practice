package racingcar.constants;

public enum Separators {
    CAR_NAME_SEPARATOR(","),
    JOIN_SEPARATOR(", "),
    NAME_POSITION_SEPARATOR(" : "),
    LINE_CHANGE("\n");

    private final String text;

    Separators(final String text) {
        this.text = text;
    }

    public String valueOf() {
        return text;
    }
}
