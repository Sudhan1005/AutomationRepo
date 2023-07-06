package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistFlow {

	public static void main(String[] args) {
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
		
		//Add the products to wishlist
		WebElement wish  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]"));
		wish.click();
		
		WebElement wish1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]"));
		wish1.click();
		
		// Click the wishlist option
		WebElement listw = driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]"));
		listw.click();
		
		//Click the remove button
		WebElement rem = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a"));
		rem.click();

	}

}
