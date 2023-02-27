package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://vtiger.com/");
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(res).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement dclick = driver.findElement(By.xpath("//span[text()='Login']"));
		a.doubleClick(dclick).perform();
		
		
	}

}
