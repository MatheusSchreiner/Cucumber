import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "not @wip",
    plugin = {"html:reports/feature.html"},
    features = {"src/test/resources/features"}
)
public class RunCucumber {
}