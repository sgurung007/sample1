package stepDef;

import cucumber.api.java.en.Then;

public class Step1 {
	@Then("^Close the window$")
	public void close_the_window() throws Throwable {
	  System.out.println("step7");
	}
}
