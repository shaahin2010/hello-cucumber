package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Stepdefs {

	private String today;
	private String actualAnswer;

	static class IsItFriday {
		static String isItFriday(String today) {
			return "Friday".equalsIgnoreCase(today) ? "TGIF" : "Nope";
		}
	}

	@Given("today is Sunday")
	public void today_is_Sunday() {
		today = "Sunday";
	}

	@Given("today is Friday")
	public void today_is_Friday() {
		today = "Friday";
	}

	@Given("today is {string}")
	public void today_is(String string) {
		today = string;
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		actualAnswer = IsItFriday.isItFriday(today);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
		assertThat(actualAnswer, is(equalTo(string)));
	}

}
