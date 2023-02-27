package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		//WebElement res = driver.findElement(By.xpath("//span[text()='Resources']"));
        WebElement res = driver.findElement(By.xpath("//span[contains(text(),'Resources')]"));
         //Thread.sleep(3000);
        Select s=new Select(res);
        s.selectByVisibleText("Resources");
        driver.close();

	}

}
