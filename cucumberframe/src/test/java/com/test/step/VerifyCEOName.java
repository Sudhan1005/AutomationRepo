package com.test.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyCEOName {
	@Given("^the user is logged in successfully and is on home page$")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() throws Throwable {
	    System.out.println("The user is logged in successfully and is on home page");
	}

	@When("^the user clicks on the directory option from the menu bar$")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() throws Throwable {
		System.out.println("The user clicks on the directory option from the menu bar");
	}

	@When("^the user selects the job title as \"([^\"]*)\" from the drop down$")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String arg1) throws Throwable {
	    System.out.println("the user selects the job title as from the drop down");
	}

	@When("^clicks the search button$")
	public void clicks_the_search_button() throws Throwable {
	   System.out.println("clicks the search button");
	}

	@Then("^the user should see the CEo name as \"([^\"]*)\"$")
	public void the_user_should_see_the_CEo_name_as(String arg1) throws Throwable {
	   System.out.println("The user should see the CEO name as John smith");
	}

}
