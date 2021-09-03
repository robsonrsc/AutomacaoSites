package executa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@tag",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
						
		
		)




public class Executa {

}
