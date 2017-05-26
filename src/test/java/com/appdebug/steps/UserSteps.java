package com.appdebug.steps;

import com.appdebug.steps.serenity.UserFlow;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Class that contains all the step definitions that can be used to create scenarios for the arithmetic operations
 */
public class UserSteps {
    @Steps
    UserFlow user;

    @When("^the user fills in the first argument with '(.*)'$")
    public void the_user_fills_in_the_first_argument_with(String value) {
        user.fillFirstArgument(value);
    }

    @When("^the user fills in the second argument with '(.*)'$")
    public void the_user_fills_in_the_second_argument_with(String value) {
        user.fillSecondArgument(value);
    }

    @When("^the user selects addition$")
    public void the_user_selects_addition() {
        user.selectAddition();
    }

    @When("^the user selects subtraction$")
    public void the_user_selects_subtraction() {
        user.selectSubtraction();
    }

    @When("^the user selects multiplication$")
    public void the_user_selects_multiplication() {
        user.selectMultiplication();
    }

    @When("^the user selects division$")
    public void the_user_selects_division() {
        user.selectDivision();
    }

    @Then("^the user should see as result the value '(.*)'$")
    public void the_user_should_see_as_result_the_value(String expectation) {
        user.shouldSeeResult(expectation);
    }

}
