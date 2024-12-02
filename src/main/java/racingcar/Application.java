package racingcar;

import racingcar.controller.CarRacingController;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        CarRacingController controller = new CarRacingController(new InputView(), new OutputView());
        controller.start();
    }
}
