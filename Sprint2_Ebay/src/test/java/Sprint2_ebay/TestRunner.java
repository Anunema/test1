package Sprint2_ebay;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Patil\\eclipse-workspace1\\Sprint2_Ebay\\src\\test\\resources\\features\\Main.feature",
glue= {"Sprint2_ebay"},
plugin = {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
"json:target/JSONReports/report.json"}, strict=true)




public class TestRunner {

}
