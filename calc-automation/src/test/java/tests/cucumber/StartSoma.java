
package tests.cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import suporte.driver.ThreadDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/tests/cucumber/features/Soma.feature", glue = "tests.cucumber.steps", tags = {"@INTEIROS"})
public class StartSoma {

	@BeforeClass
	public static void setup() throws Exception {
		//Carregar parametros para a execução de toda feature
	}

	@AfterClass
	public static void teardown() {
		ThreadDriver.getTDriver().quit();
	}

}
