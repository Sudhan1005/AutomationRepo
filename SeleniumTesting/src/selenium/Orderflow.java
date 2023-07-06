package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orderflow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		//Click the Profile button
		WebElement Profile = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		Profile.click();
		
		//Click the Login
		WebElement log1 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		log1.click();
		
		//Enter the Email 
		WebElement mail1 = driver.findElement(By.id("input-email"));
		mail1.sendKeys("tester40@gmail.com");
		
		//Enter the Password
		WebElement pass1 = driver.findElement(By.id("input-password"));
		pass1.sendKeys("Test@123");
		
		//Submit the Login button
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		sub.submit();
		
		//Go to the home screen
		WebElement gohome = driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a"));
		gohome.click();
		
		//Add the product in the cart
		WebElement addp = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]"));
		addp.click();
		Thread.sleep(8000);
		
		//Click the checkout detail
		WebElement checkd = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
		checkd.click();
		Thread.sleep(8000);
		WebElement checkd1 = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
		checkd1.click();
	}

}
