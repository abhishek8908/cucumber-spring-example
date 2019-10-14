package hooks;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(plugin = {"json:target/cucumber-report.json", "html:target", "rerun:target/failed_scenarios.txt"}
        , features = "src/test/features"
,extraGlue = "abhishek8908.stepdefs"
,monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Test(dataProvider = "scenarios")

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
