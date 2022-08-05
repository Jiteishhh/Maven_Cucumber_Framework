package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.utilties;

public class offersPage {
	
	String productName_OffersPage;
	utilties util;
	
public offersPage(utilties util) {
		
		this.util = util;
		
		}

    

    @Then("^same result should be displayed when user search with \"([^\"]*)\" on offers page$")
    public void same_result_should_be_displayed_when_user_search_with_something_on_offers_page(String strArg1) throws Throwable {
    	
    	util.driver.findElement(By.linkText("Top Deals")).click();
    	
    	Set<String> s1 = util.driver.getWindowHandles();
    	Iterator<String> i1 = s1.iterator();
    	
    	String parentWindow = i1.next();
    	String childWindow = i1.next();
    	
    	util.driver.switchTo().window(childWindow);
    	
    	pageObjects.offersPage oP = new pageObjects.offersPage(util.driver);
    	
    	oP.searchProduct(strArg1);
    	
    	productName_OffersPage = oP.getProductName();
    	System.out.println(productName_OffersPage);
    	
    	Assert.assertEquals(util.productName_HomePage, productName_OffersPage, "yes both are same");
    	
        
    }

}
