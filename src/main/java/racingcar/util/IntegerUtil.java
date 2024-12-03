package racingcar.util;

import racingcar.constants.ExceptionMessage;

public class IntegerUtil {
    public static int parse(String answer) {
        try {
            return toInt(answer);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_NUMBER.valueOf());
        }
    }

    private static int toInt(String text) {
        return Integer.parseInt(text);
    }
}
