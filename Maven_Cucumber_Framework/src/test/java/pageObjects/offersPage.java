package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPage {
	
	public WebDriver driver;
	By searchName = By.id("search-field");
	By getProductName = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr/td[1]");
	
	
	
	public offersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void searchProduct(String name) {
		
		driver.findElement(searchName).sendKeys(name);
		
	}
	
	public String getProductName() {
		return driver.findElement(getProductName).getText();
	}

}
