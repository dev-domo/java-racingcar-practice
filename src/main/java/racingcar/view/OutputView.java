package racingcar.view;

import racingcar.constants.OutputMessage;

public class OutputView {
    public void promptForInputCarNames() {
        System.out.println(OutputMessage.INPUT_CAR_NAMES.valueOf());
    }

    public void promptForInputTryCount() {
        System.out.println(OutputMessage.INPUT_TRY_COUNT.valueOf());
    }
}
