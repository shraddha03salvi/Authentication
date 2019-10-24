package handleWindow;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindow2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is " + parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Window" + count);
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child window title is" +driver.getTitle());
				
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title is" + driver.getTitle());

	}
	}


