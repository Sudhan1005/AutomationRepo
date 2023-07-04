package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		//Click the User button
		WebElement Ac1 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		Ac1.click();
		
		//Click the Register Form
		WebElement Ac2 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		Ac2.click();
		
		//Enter the First Name
		WebElement FN = driver.findElement(By.id("input-firstname"));
		FN.sendKeys("Tester10");
		
		//Enter the last name
		WebElement LN = driver.findElement(By.id("input-lastname"));
		LN.sendKeys("User");
		
		//Enter the Email 
		WebElement mail = driver.findElement(By.id("input-email"));
		mail.sendKeys("tester47@gmail.com");
		
		//Enter the Phone
		WebElement ph = driver.findElement(By.id("input-telephone"));
		ph.sendKeys("1234567890");
		
		//Enter the Password
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys("Test@123");
		
		//Enter the Con-password
		WebElement com = driver.findElement(By.id("input-confirm"));
		com.sendKeys("Test@123");
		
		//Enter the Policy click
		WebElement pol = driver.findElement(By.name("agree"));
		pol.click();
		
		//Click the Submit continue
		WebElement conb = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		conb.submit();
		
		if (driver.getTitle() == "Your Account Has Been Created!") {
			//Click the final continue
			WebElement fcon = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
			fcon.submit();
		} 
			//Click login link
			WebElement log = driver.findElement(By.xpath("//*[@id=\"content\"]/p/a"));
			log.click();
			
			//Enter the Email 
			WebElement mail1 = driver.findElement(By.id("input-email"));
			mail1.sendKeys("tester34@gmail.com");
			
			//Enter the Password
			WebElement pass1 = driver.findElement(By.id("input-password"));
			pass1.sendKeys("Test@123");
			
			//Submit the Login button
			WebElement sub = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			sub.submit();
	}

}