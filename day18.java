package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String expectedProduct = "Sauce Labs Bolt T-Shirt";
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_name"));
		boolean productFound = false;
		for (int i = 0; i < items.size(); i++) {

			if (items.get(i).getText().equals(expectedProduct)) {
				productFound = true;
				break;
			}
		}
		if (productFound) {
			System.out.println("product available");
			System.out.println("Test case 4 pass");
		} else {
			System.out.println("product not available");
			System.out.println("Test case 4 fail");
		}

	}

}
