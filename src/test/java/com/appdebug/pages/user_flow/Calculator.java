package com.appdebug.pages.user_flow;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Page Object class for the calculator.
 */
public class Calculator extends PageObject {

    /**
     * Sets the first argument (first operand)
     * @param value the number to be set as first operand
     */
    public void setFirstArgument(String value) {
        WebElementFacade firstArgument = this.find(MobileBy.AccessibilityId("arg1"));
        firstArgument.type(value);
    }

    /**
     * Sets the second argument (second operand)
     * @param value the number to be set as second operand
     */
    public void setSecondArgument(String value) {
        WebElementFacade secondArgument = this.find(MobileBy.AccessibilityId("arg2"));
        secondArgument.type(value);
    }

    /**
     * Selects the addition operation
     */
    public void selectAddition() {
        WebElementFacade addition = this.find(MobileBy.AccessibilityId("addition"));
        addition.click();
    }

    /**
     * Selects the subtraction operation
     */
    public void selectSubtraction() {
        WebElementFacade subtraction = this.find(MobileBy.AccessibilityId("subtraction"));
        subtraction.click();
    }

    /**
     * Selects the multiplication operation
     */
    public void selectMultiplication() {
        WebElementFacade subtraction = this.find(MobileBy.AccessibilityId("multiplication"));
        subtraction.click();
    }

    /**
     * Selects the division operation
     */
    public void selectDivision() {
        WebElementFacade subtraction = this.find(MobileBy.AccessibilityId("division"));
        subtraction.click();
    }

    /**
     * Gets the result of the calculation
     * @return a String containing the result of the calculation
     */
    public String getResult() {
        WebElementFacade result = this.find(MobileBy.AccessibilityId("result"));
        return result.getText();
    }
}
