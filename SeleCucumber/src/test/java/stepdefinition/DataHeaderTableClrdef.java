package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataHeaderTableClrdef {
	WebDriver drive;
	@Given("^user is at the login page$")
	public void user_is_at_the_login_page() throws Throwable {
		drive = new ChromeDriver();
		drive.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^the customer enters the Credentials$")
	public void the_customer_enters_the_Credentials(DataTable dataTable) throws Throwable {
	   List<Map<String,String>> datatab = dataTable.asMaps(String.class, String.class);
	   String user = datatab.get(1).get("Username");
	   String pass = datatab.get(1).get("Password");
	   drive.findElement(By.id("input-email")).sendKeys(user);
	   drive.findElement(By.id("input-password")).sendKeys(pass);
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		drive.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}

	@Then("^the user enters the home page$")
	public void the_user_enters_the_home_page() throws Throwable {
		boolean sta = drive.findElement(By.partialLinkText("My Account")).isDisplayed();
		if(sta==true) {
			System.out.println("Test Script passed");
	}
}}
