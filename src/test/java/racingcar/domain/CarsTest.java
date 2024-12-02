package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void 자동차_중_전진_최댓값_찾기() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Cars cars = new Cars(List.of(pobi, jun));

        pobi.move(4);
        jun.move(3);

        assertThat(cars.findMaxForward()).isEqualTo(4);
    }

    @Test
    void 자동차_중_전진_최댓값만큼_전진한_자동차_하나_찾기() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Car nunu = new Car("nunu");
        Cars cars = new Cars(List.of(pobi, jun, nunu));

        pobi.move(4);
        jun.move(3);
        nunu.move(3);

        assertThat(cars.findWinners(cars.findMaxForward())).isEqualTo(List.of(pobi.getName()));
    }

    @Test
    void 자동차_중_전진_최댓값만큼_전진한_자동차_여러_개_찾기() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Car nunu = new Car("nunu");
        Cars cars = new Cars(List.of(pobi, jun, nunu));

        pobi.move(4);
        jun.move(4);
        nunu.move(3);

        assertThat(cars.findWinners(cars.findMaxForward())).isEqualTo(List.of(pobi.getName(), jun.getName()));
    }
}
