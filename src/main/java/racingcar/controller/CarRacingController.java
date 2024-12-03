package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.CarsFactory;
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
        Cars cars = inputCars();
        int tryCount = inputTryCount();

        race(tryCount, cars);

        announceWinners(cars);
    }

    private Cars inputCars() {
        outputView.promptForInputCarNames();
        String carNames = inputView.answer();
        return CarsFactory.createCars(CarNameParser.parse(carNames));
    }

    private int inputTryCount() {
        outputView.promptForInputTryCount();
        return IntegerUtil.parse(inputView.answer());
    }

    private void race(int tryCount, Cars cars) {
        outputView.showResultSequence();
        while (tryCount > 0) {
            cars.askGoForward();
            outputView.showResult(cars);
            tryCount--;
        }
    }

    private void announceWinners(Cars cars) {
        outputView.showWinners(cars.findWinners(cars.findMaxForward()));
    }
}
