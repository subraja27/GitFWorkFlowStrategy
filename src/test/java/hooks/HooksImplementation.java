package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;

public class HooksImplementation extends BaseClass{
	
	@Before
	public void init() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://eqaroloflow.co.za/wp/");

	}
	
	@After
	public void tearDown() {
		//driver.quit();

	}
	
	@AfterStep
	public void setUp() throws FileNotFoundException {
		File src = driver.getScreenshotAs(OutputType.FILE);
		Allure.addAttachment("Snapshot", new FileInputStream(src));

	}

}
