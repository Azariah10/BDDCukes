package com.qa.cucumberOptions;

import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/qa/features",
        glue= {"com/qa/stepDefinition"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
        format = {"pretty", "html:target/htmlreports"},
        monochrome = true,
        strict = false,
        dryRun = false
        //tags = {"@smoke"}

)

public class Runner {

    @BeforeClass
    public static void writeExtentReport() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("output/myreport.html");
    }
}