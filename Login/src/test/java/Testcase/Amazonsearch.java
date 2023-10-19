package Testcase;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;

public class Amazonsearch {
@Test
	public void login() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();;
		driver.findElement(By.name("q")).sendKeys("shoes");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


}


}
