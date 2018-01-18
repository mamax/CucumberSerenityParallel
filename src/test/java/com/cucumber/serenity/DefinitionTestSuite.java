package com.cucumber.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features")
public class DefinitionTestSuite {

    private static final Logger LOG = LoggerFactory.getLogger(DefinitionTestSuite.class.getSimpleName());

    @BeforeClass
    public static void setUpProperties() {
        try {
            Class.forName("com.cucumber.serenity.utils.SerenityProperties");
        } catch (ClassNotFoundException e) {
            LOG.error("Error instantiating properties", e);
        }
    }

}
