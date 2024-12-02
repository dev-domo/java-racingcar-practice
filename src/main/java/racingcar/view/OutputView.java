package racingcar.view;

import racingcar.constants.OutputMessage;
import racingcar.domain.Cars;

public class OutputView {
    public void promptForInputCarNames() {
        System.out.println(OutputMessage.INPUT_CAR_NAMES.valueOf());
    }

    public void promptForInputTryCount() {
        System.out.println(OutputMessage.INPUT_TRY_COUNT.valueOf());
    }

    public void showResultSequence() {
        System.out.println(OutputMessage.RACE_RESULT.valueOf());
    }

    public void showResult(Cars cars) {
        System.out.println(cars.toString());
    }

    public void showWinners(String winners) {
        System.out.print(OutputMessage.FINAL_WINNERS.valueOf());
        System.out.print(winners);
    }
}
