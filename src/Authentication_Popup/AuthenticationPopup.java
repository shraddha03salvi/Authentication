package Authentication_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//syntax:- http://username:password@test.com
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		String text = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
		driver.close();
		
	}

}
