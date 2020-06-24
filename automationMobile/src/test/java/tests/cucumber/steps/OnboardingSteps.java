package tests.cucumber.steps;

import com.br.packageObjectMobile.MobileOnboarding;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import io.appium.java_client.AppiumDriver;
import suporte.driver.ThreadDriver;
import suporte.GeraCpf;

public class OnboardingSteps extends BaseSteps {

	@SuppressWarnings("rawtypes")
	AppiumDriver driver;
	GeraCpf gerador = new GeraCpf();

	public void initiliazeSteps() {
		initializeCucumber();
	}

	@Dado("que estou no app do banco midway")
	public void que_estou_no_app_do_banco_midway() throws Exception {

		new MobileOnboarding(ThreadDriver.getTDriver()).clicarBotaoMinhaConta();
		new MobileOnboarding(ThreadDriver.getTDriver()).clicarBotaoEntrar();

	}
	
	@Quando("clico em abrir minha conta midway")
	public void clico_em_abrir_minha_conta_midway() throws Exception {

		new MobileOnboarding(ThreadDriver.getTDriver()).escreverCpf("60997296070"); 
		new MobileOnboarding(ThreadDriver.getTDriver()).clicarContinuar();
		new MobileOnboarding(ThreadDriver.getTDriver()).escreverNome("Rodrigo de Deus");
		new MobileOnboarding(ThreadDriver.getTDriver()).escreverComoQuerSerChamado("Rodrigo Deus");
		new MobileOnboarding(ThreadDriver.getTDriver()).escreverCelular("11974262854");
		new MobileOnboarding(ThreadDriver.getTDriver()).escreverEmail("rodrigo.florindo@gmail.com");
		new MobileOnboarding(ThreadDriver.getTDriver()).escreverDataNascimento("11121988");
		new MobileOnboarding(ThreadDriver.getTDriver()).swipeScreenFaceId();

	}
}

