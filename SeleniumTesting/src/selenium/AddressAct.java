package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressAct {

	public static void main(String[] args) throws Exception {
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
				mail1.sendKeys("tester40@gmail.com");
				
				//Enter the Password
				WebElement pass1 = driver.findElement(By.id("input-password"));
				pass1.sendKeys("Test@123");
				
				//Submit the Login button
				WebElement sub = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
				sub.submit();
				
				//Click the Address option
				WebElement Addr = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[4]"));
				Addr.click();
				
				//Click the New address button
				WebElement Newa = driver.findElement(By.linkText("New Address"));
				Newa.click();
				
				//Enter the First name
				WebElement FN = driver.findElement(By.id("input-firstname"));
				FN.sendKeys("Testing");
				
				//Enter the Last name
				WebElement LN = driver.findElement(By.id("input-lastname"));
				LN.sendKeys("User");
				
				//Enter the Address line
				WebElement Aline = driver.findElement(By.id("input-address-1"));
				Aline.sendKeys("Testing user address");
				
				//Enter the City
				WebElement city = driver.findElement(By.id("input-city"));
				city.sendKeys("Testcity");
				
				//Enter the pincode
				WebElement pin = driver.findElement(By.id("input-postcode"));
				pin.sendKeys("123456");
				
				//Enter the Country
				WebElement conr = driver.findElement(By.id("input-country"));
				Select select = new Select(conr);
				select.selectByVisibleText("India");
				
				//Enter the State
				WebElement sta = driver.findElement(By.id("input-zone"));
				Select select1 = new Select(sta);
				select1.selectByVisibleText("Tamil Nadu");
				
				//Enter the Submit address
				WebElement subadd = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
				subadd.submit();
				
				//Add 2nd address
				//Click the New address button
				WebElement Newa1 = driver.findElement(By.linkText("New Address"));
				Newa1.click();
				
				WebElement FN1 = driver.findElement(By.id("input-firstname"));
				FN1.sendKeys("Testing");
				
				//Enter the Last name
				WebElement LN1 = driver.findElement(By.id("input-lastname"));
				LN1.sendKeys("User");
				
				//Enter the Address line
				WebElement Aline1 = driver.findElement(By.id("input-address-1"));
				Aline1.sendKeys("Testing user address");
				
				//Enter the City
				WebElement city1 = driver.findElement(By.id("input-city"));
				city1.sendKeys("Testcity");
				
				//Enter the pincode
				WebElement pin1 = driver.findElement(By.id("input-postcode"));
				pin1.sendKeys("123456");
				
				//Enter the Country
				WebElement conr1 = driver.findElement(By.id("input-country"));
				Select select2 = new Select(conr1);
				select2.selectByVisibleText("India");
				Thread.sleep(3000);				
				//Enter the State
				WebElement sta1 = driver.findElement(By.xpath("//*[@id=\"input-zone\"]"));
				Select select3 = new Select(sta1);
				select3.selectByVisibleText("Goa");
				
				//Enter the Submit address
				WebElement subadd1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
				subadd1.submit();
				
				//Click the edit button
				WebElement edit = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[2]/a[1]"));
				edit.click();
				
				//Append the address line text
				WebElement Aline2 = driver.findElement(By.id("input-address-1"));
				Aline2.sendKeys("Appended");
				
				//After the edit and  Submit address
				WebElement subadd2 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
				subadd2.submit();
				
				//Delete the Address
				WebElement del = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[2]/a[2]"));
				del.click();
				
				}

}
