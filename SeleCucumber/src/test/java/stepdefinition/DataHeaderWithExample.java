package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataHeaderWithExample {
	WebDriver drive;
	@Given("^Tester is at the login page$")
	public void tester_is_at_the_login_page() throws Throwable {
		drive = new ChromeDriver();
		drive.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^user enters \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enters_and_Password(String arg1, String arg2) throws Throwable {
		drive.findElement(By.id("input-email")).sendKeys("tester38@gmail.com");
	    drive.findElement(By.id("input-password")).sendKeys("Test@123");
	}

	@When("^clicks submit$")
	public void clicks_submit() throws Throwable {
		drive.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
}
