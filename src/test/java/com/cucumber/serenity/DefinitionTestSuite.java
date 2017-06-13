package com.cucumber.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features",plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"})
public class DefinitionTestSuite {}
