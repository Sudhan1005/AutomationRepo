package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableHeaderDef {
	WebDriver drive;
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		  drive = new ChromeDriver();
		  drive.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^the user enters the Credentials$")
	public void the_user_enters_the_Credentials(DataTable datatable) throws Throwable {
		List<String> Cred = datatable.asList(String.class);
		String Email =Cred.get(0);
		String pass = Cred.get(1);
		drive.findElement(By.id("input-email")).sendKeys(Email);
	    drive.findElement(By.id("input-password")).sendKeys(pass);
	}

	@When("^click the Submit button$")
	public void click_the_Submit_button() throws Throwable {
		drive.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	   
	}

	@Then("^the user see the home page$")
	public void the_user_see_the_home_page() throws Throwable {
		boolean sta = drive.findElement(By.partialLinkText("My Account")).isDisplayed();
		if(sta==true) {
			System.out.println("Test Script passed");
	}
}
}
