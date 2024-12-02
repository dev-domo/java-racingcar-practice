package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.constants.ExceptionMessage;

public class NameTest {
    @Test
    void 자동차_이름_생성() {
        Name name = new Name("pobi");
        assertThat(name).isEqualTo(new Name("pobi"));
    }

    @Test
    void 자동차_이름은_5자_이하여야_한다() {
        assertThatThrownBy(() -> new Name("banana"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessage.INVALID_CAR_NAME_LENGTH.valueOf());
    }

    @Test
    void to_string() {
        Name name = new Name("pobi");
        assertThat(name.toString()).isEqualTo("pobi");
    }
}
