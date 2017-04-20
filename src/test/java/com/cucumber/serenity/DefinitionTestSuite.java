package com.cucumber.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources/features/Lookup_A_Definition.feature", "src/test/resources/features/Lookup_B_Definition.feature", "src/test/resources/features/Lookup_C_Definition.feature", "src/test/resources/features/Lookup_D_Definition.feature"})
public class DefinitionTestSuite {}
