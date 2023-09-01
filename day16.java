package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		
		// Test case 2
		ChromeDriver driver = new ChromeDriver();
		String expectedUrl = "inventory";
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		 username.sendKeys("standard_user");
		 password.sendKeys("secret_sauce");
		 	 login.click();
		 	 String actualUrl = driver.getCurrentUrl();
		 	 if(actualUrl.contains(expectedUrl)) {
		 		 System.out.println("Testcase 2 pass");
		 	 }
		 	 else {
		 		 System.out.println("Testcase 2 Fail");
		 	 }
		
	}

}
