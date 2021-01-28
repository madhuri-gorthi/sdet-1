package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\MadhuriGorthi\\SDET\\cucumberproject",
    glue = {"stepdefinitions"},
    tags = "@HRM",
    strict = true,
    plugin = {"json:test-reports/json-report.json"},
    monochrome = true
)

public class ActivitiesRunner {
    //empty
}