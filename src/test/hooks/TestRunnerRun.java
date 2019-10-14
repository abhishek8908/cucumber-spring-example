package hooks;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(plugin = {"json:target/cucumber-parallel/cucumber-rerun-report.json", "html:target/feature-rerun"}
        , features = "file:target/failed_scenarios.txt"
        , extraGlue = "abhishek8908.stepdefs"
        , monochrome = true)
public class TestRunnerRun extends AbstractTestNGCucumberTests {
    @Test(dataProvider = "scenarios")

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
