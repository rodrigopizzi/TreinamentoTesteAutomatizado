package rtstreinamento.turmajunho;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@executar-esse" }, format = { "json:target/cucumber.json" })
public class ExecucaoUnicaRunnerTest {

}
