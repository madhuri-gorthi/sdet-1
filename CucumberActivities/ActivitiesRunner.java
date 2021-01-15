package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\MadhuriGorthi\\SDET\\cucumberactivities",
    glue = {"StepDefinitions"},
    tags = "@activity2_5",
    strict = true,
    plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)

public class ActivitiesRunner {
    //empty
}