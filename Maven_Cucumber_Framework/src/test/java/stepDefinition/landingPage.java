package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.utilties;

public class landingPage {
	
	utilties util;
	
	public landingPage(utilties util) {
		
		this.util = util;
		
		
	}
	
	@Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/jiteshbhojwani/eclipse-workspace/Maven_Cucumber_Framework/chromeDriver/chromedriver");
		util.driver = new ChromeDriver();
        util.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^when user search with a short name like \"([^\"]*)\"$")
    public void when_user_search_with_a_short_name_like_something(String strArg1) throws Throwable {
    	
    	pageObjects.landingPage lP = new pageObjects.landingPage(util.driver);
    	
    	lP.searchProduct(strArg1);
    	
    	util.productName_HomePage = lP.getProductNameText().split("-")[0].trim();
    	System.out.println(util.productName_HomePage);
    	System.out.println("abc");
       
    }



}
