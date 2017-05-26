package com.appdebug.steps.serenity;

import com.appdebug.pages.user_flow.Calculator;
import net.thucydides.core.annotations.Step;

/**
 * Class that contains atomic interactions of the user with the calculator
 */
public class UserFlow {
    Calculator calculator;

    @Step
    public void fillFirstArgument(String value) {
        calculator.setFirstArgument(value);
    }

    @Step
    public void fillSecondArgument(String value) {
        calculator.setSecondArgument(value);
    }

    @Step
    public void selectAddition() {
        calculator.selectAddition();
    }

    @Step
    public void selectSubtraction() {
        calculator.selectSubtraction();
    }

    @Step
    public void selectMultiplication() {
        calculator.selectMultiplication();
    }

    @Step
    public void selectDivision() {
        calculator.selectDivision();
    }

    @Step
    public void shouldSeeResult(String expectation) {
        assert(calculator.getResult().equalsIgnoreCase(expectation));
    }

}
