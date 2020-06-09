package tests.cucumber.steps;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import screens.CalcScreen;
import screens.base.BaseScreen;
import suporte.driver.ThreadDriver;

public class SomaSteps extends BaseSteps {
	
	

	public void initiliazeSteps() {
		initializeCucumber();
	}

	@Dado("que estou no app conta midway") 
	public void que_estou_no_app_conta_midway() throws Exception {
		
	   new CalcScreen(ThreadDriver.getTDriver()).clicarBotaoMinhaConta();

}  

	@Quando("clico em abrir minha conta midway")
	public void clico_em_abrir_minha_conta_midway() throws Exception {
		
		 
	    new CalcScreen(ThreadDriver.getTDriver()).clicarBotaoEntrar(); 
	    new CalcScreen(ThreadDriver.getTDriver()).escreverCpf("40268015007");
	    new CalcScreen(ThreadDriver.getTDriver()).clicarContinuar();
	    new CalcScreen(ThreadDriver.getTDriver()).escreverNome("Rodrigo de Deus");
	    new CalcScreen(ThreadDriver.getTDriver()).escreverComoQuerSerChamado("Rodrigo Deus");
	    new CalcScreen(ThreadDriver.getTDriver()).escreverCelular("11972563388");
	    new CalcScreen(ThreadDriver.getTDriver()).escreverEmail("rodrigo-florindo@hotmail.com");
	    new CalcScreen(ThreadDriver.getTDriver()).escreverDataNascimento("11121988");
	    new CalcScreen(ThreadDriver.getTDriver()).clicarContinuarDadosPessoais();

	}

	//@Entao("conta simples aberta com sucesso")
	//public void conta_simples_aberta_com_sucesso() throws Exception {
    //Assert.assertEquals("7", new CalcScreen(ThreadDriver.getTDriver()).pegarResultado());
	//}

}
