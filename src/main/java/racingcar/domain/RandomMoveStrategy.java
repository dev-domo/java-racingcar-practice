package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMoveStrategy implements MoveStrategy {
    private static final int MINIMUM_RANDOM_BOUND = 1;
    private static final int MAXIMUM_RANDOM_BOUND = 9;
    private static final int FORWARD_STANDARD = 4;

    @Override
    public boolean movable() {
        int random = pickRandomNumber();
        return random >= FORWARD_STANDARD;
    }

    private int pickRandomNumber() {
        return Randoms.pickNumberInRange(MINIMUM_RANDOM_BOUND, MAXIMUM_RANDOM_BOUND);
    }
}
