package tests.cucumber.steps;

import constants.Globals;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import suporte.MassaDeDados;
import suporte.driver.ThreadDriver;
import suporte.plataforma.IPlatform;
import suporte.plataforma.PlatformFactory;

public class Hooks {

	@Before
	public void beforeScenario(Scenario scenario) throws Exception {

		MassaDeDados.lerMassaDeDados(scenario.getSourceTagNames().iterator().next().replace("@", ""));

		IPlatform platform = PlatformFactory.getInstance().getPlatform(Globals.PLATAFORMA);
		platform.setupAppium();

		// System.out.println(scenario.getName());
		// System.out.println(scenario.getId());
		// System.out.println(scenario.getUri());
		// System.out.println(scenario.getStatus());
		// System.out.println(scenario.getLines());
		// DadosExecucao.setIdExecucao(LocalDateUtils.getDataHora());

	}
	

	@After
	public void afterScenario(Scenario scenario) throws Exception {
//		if (scenario.isFailed()) {
//			if (new Utils().getError() != null)
//				scenario.write(new Utils().getError());
//			// Take a screenshot...
//			final byte[] screenshot = ((TakesScreenshot) ThreadDriver.getTDriver()).getScreenshotAs(OutputType.BYTES);
//			// embed it in the report.
//			scenario.embed(screenshot, "image/png");
//		}
		ThreadDriver.getTDriver().quit();
	}
}
