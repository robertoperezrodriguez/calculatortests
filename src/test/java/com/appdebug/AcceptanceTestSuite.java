package com.appdebug;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;


/**
 * Class for running the test suite.
 * To filter by tag use: @CucumberOptions(features="src/test/resources/features/", tags = {"@tag_name"})
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/")
public class AcceptanceTestSuite {}





