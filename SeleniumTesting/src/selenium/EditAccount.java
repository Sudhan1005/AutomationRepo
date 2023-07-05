package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		
				//Click the Profile button
				WebElement Profile = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
				Profile.click();
				
				//Click the Login
				WebElement log1 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
				log1.click();
				
				//Enter the Email 
				WebElement mail1 = driver.findElement(By.id("input-email"));
				mail1.sendKeys("tester34@gmail.com");
				
				//Enter the Password
				WebElement pass1 = driver.findElement(By.id("input-password"));
				pass1.sendKeys("Test@123");
				
				//Submit the Login button
				WebElement sub = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
				sub.submit();
				
				//Click the EDit account option
				WebElement Editac = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]"));
				Editac.click();
				
				//Edit the Account info
				WebElement tele = driver.findElement(By.id("input-telephone"));
				tele.clear();
				tele.sendKeys("1234567893");
				
				//Submit the action
				WebElement editsub = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
				editsub.click();
				
				//Click the Password option
				WebElement passchan = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[3]"));
				passchan.click();
				
				//Enter the password
				WebElement pass = driver.findElement(By.name("password"));
				pass.sendKeys("Pass@123");
				
				//Reenter the password
				WebElement passc = driver.findElement(By.name("confirm"));
				passc.sendKeys("Pass@123");
				
				//submit the changes
				WebElement subp = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
				subp.submit();

	}

}
