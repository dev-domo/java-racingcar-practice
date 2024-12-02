package racingcar.constants;

public enum ExceptionMessage {
    INVALID_CAR_NAME_LENGTH("[ERROR] 자동차 이름은 5자 이하여야 합니다."),
    UNDIVIDED_BY_SEPARATOR("[ERROR] 자동차 이름은 쉼표로 구분되어야 합니다."),
    INVALID_NUMBER("[ERROR] 아라비아 숫자가 아닙니다.");

    private final String message;

    ExceptionMessage(final String message) {
        this.message = message;
    }

    public String valueOf() {
        return message;
    }
}
