package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.domain.CarFactory;
import racingcar.domain.Cars;
import racingcar.domain.parser.CarNameParser;
import racingcar.util.IntegerUtil;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarRacingController {
    private final InputView inputView;
    private final OutputView outputView;

    public CarRacingController(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        outputView.promptForInputCarNames();
        String names = inputView.answer();
        List<String> carNames = CarNameParser.parse(names);
        Cars cars = CarFactory.createCars(carNames);

        outputView.promptForInputTryCount();
        int tryCount = IntegerUtil.parse(inputView.answer());

        for (int i = 0; i < tryCount; i++) {
            cars.askGoForward(Randoms.pickNumberInRange(1, 9));
        }

        outputView.showWinners(cars.findWinners(cars.findMaxForward()));
    }
}
