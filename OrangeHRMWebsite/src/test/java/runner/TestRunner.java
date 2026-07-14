package runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature",
glue = "steps",
 
dryRun = false,
 
//tags = "@ValidRegister",
 
plugin = {
 
"pretty",
 
"html:target/CucumberReport.html",
 
"json:target/Cucumber.json",
 
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
 
},

monochrome = true
 
)
 
public class TestRunner extends BaseClass {
 
@BeforeClass
 
public static void Startup() {
BrowserLaunch();
maximize();

}
 
@AfterClass
public static void end() {
driver.quit();
}}