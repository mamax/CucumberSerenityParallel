package com.cucumber.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources/features/LookupADefinition.feature", "src/test/resources/features/LookupBDefinition.feature", "src/test/resources/features/LookupCDefinition.feature", "src/test/resources/features/LookupDDefinition.feature"})
public class DefinitionTestSuite {}
