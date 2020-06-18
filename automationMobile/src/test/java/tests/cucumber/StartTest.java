
package tests.cucumber; 

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import suporte.driver.ThreadDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/ContaSimples.feature", glue = "tests.cucumber.steps", tags = {"@INTEIROS"})
public class StartTest {

	@BeforeClass 
	public static void setup() throws Exception {
		//Carregar parametros para a execu��o de toda feature
	} 

	@AfterClass 
	public static void teardown() {
		ThreadDriver.getTDriver().quit();
	}

}
