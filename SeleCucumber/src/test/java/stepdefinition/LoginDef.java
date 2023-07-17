package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDef {
	WebDriver drive;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    drive = new ChromeDriver();
	    drive.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    drive.findElement(By.id("input-email")).sendKeys("tester38@gmail.com");
	    drive.findElement(By.id("input-password")).sendKeys("Test@123");
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    drive.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}

	@Then("^the user should be navigate to home page$")
	public void the_user_should_be_navigate_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		boolean sta = drive.findElement(By.partialLinkText("My Account")).isDisplayed();
		if(sta==true) {
			System.out.println("Test Script passed");			
		}
	}
}
