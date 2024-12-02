package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CarTest {
    @Test
    void 랜덤값이_4이상이면_자동차는_전진한다() {
        Car car = new Car("pobi", 0);
        car.move(4);
        assertThat(car).isEqualTo(new Car("pobi", 1));
    }

    @Test
    void 랜덤값이_3이하이면_자동차는_정지한다() {
        Car car = new Car("pobi", 0);
        car.move(3);
        assertThat(car).isEqualTo(new Car("pobi", 0));
    }

    @ParameterizedTest
    @CsvSource(value = {"3:4", "5:5"}, delimiter = ':')
    void 전진_횟수_최댓값_찾기(int position, int maxForward) {
        Car car = new Car("pobi", 4);
        assertThat(car.calculateMaxForward(position)).isEqualTo(maxForward);
    }

    @ParameterizedTest
    @CsvSource(value = {"4:true", "5:false"}, delimiter = ':')
    void 같은_전진_횟수인지_판단하기(int position, boolean expected) {
        Car car = new Car("pobi", 4);
        assertThat(car.isSamePosition(position)).isEqualTo(expected);
    }

    @Test
    void 자동차_이름_가져오기() {
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    void 현재_전진_상태() {
        Car car = new Car("nana");
        car.move(4);
        car.move(4);
        car.move(4);

        assertThat(car.toString()).isEqualTo("nana : ---");
    }
}
