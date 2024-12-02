package racingcar.domain.parser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.constants.ExceptionMessage;

public class CarNameParserTest {
    @Test
    void 자동차_이름이_쉼표로_구분되지_않으면_예외() {
        assertThatThrownBy(() -> CarNameParser.parse("pobi.nana"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessage.UNDIVIDED_BY_SEPARATOR.valueOf());
    }

    @Test
    void 자동차_이름은_쉼표로_구분한다() {
        assertThat(CarNameParser.parse("pobi,nana")).containsExactly("pobi", "nana");
    }
}
