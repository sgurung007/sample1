package com.suj1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/features",
glue = { "stepDef" },
tags = { "~@Ignore" }, format = {
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }, plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class RunnerCreateUser extends AbstractTestNGCucumberTests{

}
