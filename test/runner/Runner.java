import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/surety/ui/smoke/",
        glue = {"stepdefinition",
                "api/stepdefinition"},
        plugin = {
                "html:target/cucumber-html-report-ui-smoke.html",
                "json:target/cucumber-ui-smoke.json",
                "pretty:target/cucumber-pretty-ui-smoke.txt",
                "usage:target/cucumber-usage-ui-smoke.json",
                "junit:target/cucumber-results-ui-smoke.xml",})
public class RunCucumberTestSmoke extends AbstractTestNGCucumberTests {
}