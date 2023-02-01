package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml",
        },
        features = "./src/test/resources/features/ui_features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@tumu",
        dryRun = false
)
public class TestRunner {
}
