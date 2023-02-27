package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.vtiger.com/");
		
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
        Actions a=new Actions(driver);
        a.moveToElement(res).perform();
        //driver.findElement(By.partialLinkText("Contact Us")).click();
        //String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
        //System.out.println(text);
        Thread.sleep(2000);
        driver.close();
	}

}
