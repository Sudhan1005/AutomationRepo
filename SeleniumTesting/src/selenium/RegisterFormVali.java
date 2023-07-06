package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterFormVali {

	public static void main(String[] args) throws Exception {
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
		FN.sendKeys("");
		
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
		
		Thread.sleep(5000);
		
		//First name validation
		if (FN.getText().isEmpty()) {
			WebElement FNA1 = driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div"));
			String alert1 = FNA1.getText();
			System.out.println(alert1);
		} else if (FN.getText().length()<=32){
			WebElement FNA2 = driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div"));
			String alert2 = FNA2.getText();
			System.out.println(alert2);
		}

	}

}
