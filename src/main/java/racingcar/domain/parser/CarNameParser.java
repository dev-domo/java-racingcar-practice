package racingcar.domain.parser;

import static racingcar.constants.Separators.CAR_NAME_SEPARATOR;

import java.util.Arrays;
import java.util.List;
import racingcar.constants.ExceptionMessage;

public class CarNameParser {

    public static List<String> parse(String input) {
        List<String> names = Arrays.stream(input.split(CAR_NAME_SEPARATOR.valueOf())).toList();
        checkDividedBySeparator(names, input);
        return names;
    }

    private static void checkDividedBySeparator(List<String> names, String input) {
        if (names.getFirst().equals(input)) {
            throw new IllegalArgumentException(ExceptionMessage.UNDIVIDED_BY_SEPARATOR.valueOf());
        }
    }
}
