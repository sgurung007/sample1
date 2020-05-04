package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;

public class Steps {
	
	 //WebDriver driver;
	 
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:/Users/suraj.gurung/Downloads/chromedriver.exe");
	 //driver = new ChromeDriver();
	// driver.get("https://www.bbc.com/");
	    System.out.println("step1:give is processing" );
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	  System.out.println("step2");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	  System.out.println("step3");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	  System.out.println("step4");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	   System.out.println("step5");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	  System.out.println("step6");
	  //Assert.fail();
	}
	

	



}
