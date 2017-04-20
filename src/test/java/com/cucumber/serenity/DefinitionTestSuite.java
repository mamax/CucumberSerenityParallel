package com.cucumber.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources/features/consult_dictionary/LookupADefinition.feature", "src/test/resources/features/consult_dictionary/LookupADefinition_1.feature", "src/test/resources/features/consult_dictionary/LookupADefinition_2.feature", "src/test/resources/features/consult_dictionary/LookupADefinition_3.feature"})
public class DefinitionTestSuite {}
