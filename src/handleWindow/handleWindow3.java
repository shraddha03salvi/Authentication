package handleWindow;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindow3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is " + parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		driver.switchTo().window(tabs.get(2));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.close();
		Thread.sleep(3000);
		System.out.println("Title of parent window is " +driver.getTitle());
		
		

	}

}
