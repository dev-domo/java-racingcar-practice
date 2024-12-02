package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PositionTest {
    @Test
    void 위치값_생성() {
        Position position = new Position(5);
        assertThat(position).isEqualTo(new Position(5));
    }

    @Test
    void 위치값_증가() {
        Position position = new Position(0);
        assertThat(position.increase()).isEqualTo(new Position(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"0:1", "2:2"}, delimiter = ':')
    void 더_큰_값_찾기(int number, int largerValue) {
        Position position = new Position(1);
        assertThat(position.getLargerValue(number)).isEqualTo(largerValue);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:false"}, delimiter = ':')
    void 같은_값인지_판단하기(int number, boolean expected) {
        Position position = new Position(1);
        assertThat(position.isSameValue(number)).isEqualTo(expected);
    }

    @Test
    void 현재_상태_반환() {
        Position position = new Position(3);
        assertThat(position.currentState()).isEqualTo("---");
    }
}
