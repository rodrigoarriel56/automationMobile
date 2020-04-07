package tests.cucumber.steps;

import org.junit.Assert;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import screens.CalcScreen;
import suporte.driver.ThreadDriver;

public class SomaSteps extends BaseSteps {

	public void initiliazeSteps() {
		initializeCucumber();
	}

	@Dado("que estou com a calculadora aberta")
	public void que_estou_com_a_calculadora_aberta() {

	}

	@Quando("somo dois numeros inteiros")
	public void somo_dois_numeros_inteiros() throws Exception {
		new CalcScreen(ThreadDriver.getTDriver()).somarInteiros();

	}

	@Entao("valido se o resultados obtido e igual ao esperado")
	public void valido_se_o_resultados_obtido_e_igual_ao_esperado() throws Exception {
		Assert.assertEquals("7", new CalcScreen(ThreadDriver.getTDriver()).pegarResultado());
	}

}
