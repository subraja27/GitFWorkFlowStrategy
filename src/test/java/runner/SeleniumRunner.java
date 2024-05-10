package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/PizzaOrder.feature",
glue={"pages","hooks"},
plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
monochrome=true)
public class SeleniumRunner extends AbstractTestNGCucumberTests {

}
