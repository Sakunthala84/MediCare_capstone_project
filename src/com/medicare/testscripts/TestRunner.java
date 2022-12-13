package com.medicare.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"Features//add_product.feature","Features//login.feature", "Features//user_register.feature","Features//add_to_cart.feature","Features//buy_product.feature"}, glue="com.testscripts"


//, tags="@TC_101")
	//, dryRun=true
	,plugin={"progress" , "html:target/Cucumber.html"}
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}