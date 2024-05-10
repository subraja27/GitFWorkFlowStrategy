package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/GetStateProvince.feature",
				glue= {"apiSteps"},
				plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
				monochrome=true,
				publish=true
				)
public class APIRunner extends AbstractTestNGCucumberTests{

}
