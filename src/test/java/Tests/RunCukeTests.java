package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", plugin = {}, tags = { "@SmokeTests" })

public class RunCukeTests {

	@BeforeClass
	public static void setup() {

	}

	@AfterClass
	public static void tearDown() {

	}
}
