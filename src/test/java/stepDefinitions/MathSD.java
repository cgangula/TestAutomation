package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * Step definition for the feature file
 */

public class MathSD {

	public int number1;
	public int number2;
	public int actualValue;

	@Given("^I have two numbers (\\d+) and (\\d+)$")
	public void i_have_two_numbers_and(int arg1, int arg2) throws Throwable {
		number1 = arg1;
		number2 = arg2;
	}

	@When("^I add two numbers$")
	public void i_add_two_numbers() throws Throwable {
		actualValue = number1 + number2;
	}
	
	@When("^I subtract two numbers$")
	public void i_subtract_two_numbers() throws Throwable {
		actualValue = number1 - number2;
	}

	@Then("^I verify expected value (\\d+)$")
	public void i_verify_expected_value(int expectedValue) throws Throwable {
		Assert.assertEquals(expectedValue, actualValue);
	}
}
