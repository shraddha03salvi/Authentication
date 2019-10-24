package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo {

	@Test
	public void testFrames() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mukesh_50/Desktop/HTML/myframes.html");
		driver.switchTo().frame("w3c");
		driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
		driver.findElement(By.name("search")).sendKeys("CSS");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("html/body/a")).click();
	}
}
