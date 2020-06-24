package tests.cucumber.steps;

import com.br.packageObjectMobile.MobilePageObect;

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

		new MobilePageObect(ThreadDriver.getTDriver()).clicarBotaoMinhaConta();
		new MobilePageObect(ThreadDriver.getTDriver()).clicarBotaoEntrar();

	}
	
	@Quando("clico em abrir minha conta midway")
	public void clico_em_abrir_minha_conta_midway() throws Exception {

		new MobilePageObect(ThreadDriver.getTDriver()).escreverCpf("60997296070"); 
		new MobilePageObect(ThreadDriver.getTDriver()).clicarContinuar();
		new MobilePageObect(ThreadDriver.getTDriver()).escreverNome("Rodrigo de Deus");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverComoQuerSerChamado("Rodrigo Deus");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverCelular("11974262854");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverEmail("rodrigo.florindo@gmail.com");
		new MobilePageObect(ThreadDriver.getTDriver()).escreverDataNascimento("11121988");
		new MobilePageObect(ThreadDriver.getTDriver()).swipeScreenFaceId();

	}
}

