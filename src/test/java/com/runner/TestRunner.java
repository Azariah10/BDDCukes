package com.runner;

import org.testng.annotations.BeforeClass;
import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
      features = "src/test/java/com/features/LoginHQUser.feature",
      glue= {"StepDefinition"},
      plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
      format = {"pretty", "html:target/htmlreports"},
      monochrome = true,
      strict = false,
      dryRun = false
      //tags = {"~@Sanity", "~@Regression", "~@Smoke"}

)

public class TestRunner extends AbstractTestNGCucumberTests {



  @BeforeClass
  public static void writeExtentReport() {
      ExtentProperties extentProperties = ExtentProperties.INSTANCE;
      extentProperties.setReportPath("output/myreport.html");
  }

}