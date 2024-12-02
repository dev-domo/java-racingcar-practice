package racingcar.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.constants.ExceptionMessage;

public class IntegerUtilTest {
    @Test
    void 문자를_숫자로_변환() {
        assertThat(IntegerUtil.parse("3")).isEqualTo(3);
    }

    @Test
    void 숫자로_바꿀_수_있는_문자가_아니면_예외() {
        assertThatThrownBy(() -> IntegerUtil.parse("삼"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessage.INVALID_NUMBER.valueOf());
    }
}
