package racingcar.util;

import racingcar.constants.ExceptionMessage;

public class IntegerUtil {
    public static int parse(String answer) {
        try {
            return Integer.parseInt(answer);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_NUMBER.valueOf());
        }
    }
}
