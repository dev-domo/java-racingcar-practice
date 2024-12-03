package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void Cars_생성() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Cars cars = new Cars(List.of(pobi, jun));
        assertThat(cars).isEqualTo(new Cars(List.of(pobi, jun)));
    }

    @Test
    void 자동차_중_전진_최댓값_찾기() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Cars cars = new Cars(List.of(pobi, jun));

        pobi.move(true);
        jun.move(false);

        assertThat(cars.findMaxForward()).isEqualTo(1);
    }

    @Test
    void 자동차_중_전진_최댓값만큼_전진한_자동차_하나_찾기() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Car nunu = new Car("nunu");
        Cars cars = new Cars(List.of(pobi, jun, nunu));

        pobi.move(true);
        jun.move(false);
        nunu.move(false);

        assertThat(cars.findWinners(cars.findMaxForward())).isEqualTo("pobi");
    }

    @Test
    void 자동차_중_전진_최댓값만큼_전진한_자동차_여러_개_찾기() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Car nunu = new Car("nunu");
        Cars cars = new Cars(List.of(pobi, jun, nunu));

        pobi.move(true);
        jun.move(true);
        nunu.move(false);

        assertThat(cars.findWinners(cars.findMaxForward())).isEqualTo("pobi, jun");
    }

    @Test
    void 자동차들_현재_전진_상태_출력() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Car nunu = new Car("nunu");
        Cars cars = new Cars(List.of(pobi, jun, nunu));

        pobi.move(true);
        jun.move(true);
        nunu.move(false);

        assertThat(cars.toString()).isEqualTo("pobi : -\njun : -\nnunu : \n");
    }
}
