package runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/GwBuscador.feature",
        glue = "stepDefinitions",
        snippets = SnippetType.CAMELCASE)

public class GwBuscadorRunner {
}
