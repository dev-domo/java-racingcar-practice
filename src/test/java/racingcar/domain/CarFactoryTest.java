package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {
    @Test
    void 자동차_생성() {
        assertThat(CarFactory.createCars(List.of("pobi", "nana", "sera")))
                .isEqualTo(new Cars(List.of(new Car("pobi"), new Car("nana"), new Car("sera"))));
    }
}
