package racingcar.domain.parser;

import java.util.Arrays;
import java.util.List;
import racingcar.constants.ExceptionMessage;

public class CarNameParser {
    private static final String CAR_NAME_SEPARATOR = ",";

    public static List<String> parse(String input) {
        List<String> names = Arrays.stream(input.split(CAR_NAME_SEPARATOR)).toList();
        checkDividedBySeparator(names, input);
        return names;
    }

    private static void checkDividedBySeparator(List<String> names, String input) {
        if (names.getFirst().equals(input)) {
            throw new IllegalArgumentException(ExceptionMessage.UNDIVIDED_BY_SEPARATOR.valueOf());
        }
    }
}
