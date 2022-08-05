package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
	
	WebDriver driver;
	By searchName = By.className("search-keyword");
	By getProductName = By.className("product-name");
	
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchProduct(String name) {
		driver.findElement(searchName).sendKeys(name);
	}
	
	public String getProductNameText() {
		return driver.findElement(getProductName).getText();
	}
	
	

}
