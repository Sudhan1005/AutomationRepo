package com.test.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTimeSheet {
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
	    System.out.println("The user is on the homepage");
	}

	@When("^the user clicks on the time option from the menu$")
	public void the_user_clicks_on_the_time_option_from_the_menu() throws Throwable {
		System.out.println("the user clicks on the time option from the menu");
	}

	@When("^the user enters the name as \"([^\"]*)\"$")
	public void the_user_enters_the_name_as(String arg1) throws Throwable {
		System.out.println("the user enters the name as John Smith");
	}

	@When("^clicks on the view button$")
	public void clicks_on_the_view_button() throws Throwable {
	    System.out.println("clicks on the view button");
	}

	@Then("^the user should see the message as \"([^\"]*)\"$")
	public void the_user_should_see_the_message_as(String arg1) throws Throwable {
		System.out.println("the user should see the message as No Timesheet Found");
	}
}
