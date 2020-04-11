package tests.cucumber.steps;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import screens.CalcScreen;
import suporte.driver.ThreadDriver;

public class SomaSteps extends BaseSteps {

	public void initiliazeSteps() {
		initializeCucumber();
	}

	@Dado("que estou na tela abra sua conta midway")
	public void que_estou_na_tela_abra_sua_conta_midway() throws Exception {
		
	new CalcScreen(ThreadDriver.getTDriver()).clicarBotaoMinhaConta();

} 

	@Quando("clico em Abrir minha conta midway")
	public void clico_em_abrir_minha_conta_midway() throws Exception {
	    new CalcScreen(ThreadDriver.getTDriver()).clicarBotaoEntrar(); 
	    new CalcScreen(ThreadDriver.getTDriver()).escreverCpf("38684831870");
	    new CalcScreen(ThreadDriver.getTDriver()).clicarContinuar();
	    new CalcScreen(ThreadDriver.getTDriver()).escreverNome("Rodrigo de Deus");

	}

	//@Entao("conta simples aberta com sucesso")
	//public void conta_simples_aberta_com_sucesso() throws Exception {
    //Assert.assertEquals("7", new CalcScreen(ThreadDriver.getTDriver()).pegarResultado());
	//}

}
