package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.base.BaseScreen;

public class CalcScreen extends BaseScreen {

	public CalcScreen(AppiumDriver<MobileElement> driver) throws Exception {
		super(driver);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Abrir minha conta Midway']")
	public MobileElement btnAbrirMinhaContaMidway;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Entrar']")
	public MobileElement btnEntrar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CPF']")
	public MobileElement inputLabelCPF;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nome Completo']")
	public MobileElement inputLabelNomeCompleto;

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
	public MobileElement inputTextCpf;

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
	public MobileElement inputTextNomeCompleto;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continuar']")
	public MobileElement btnContinuar;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[1]")
	public MobileElement inputTexComoQuerSerChamado;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[2]")
	public MobileElement inputTexCelular;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[3]")
	public MobileElement inputTexEmail;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[4]")
	public MobileElement inputTexDataNascimento;

	public void clicarBotaoMinhaConta() throws InterruptedException {
		Thread.sleep(300000);
		btnAbrirMinhaContaMidway.click();
		Thread.sleep(1000);

	}

	public void clicarBotaoEntrar() throws InterruptedException {
		Thread.sleep(10000);
		btnEntrar.click();
		btnEntrar.click();
	}

	public void escreverCpf(String CPF) throws InterruptedException {

		Thread.sleep(1000);
		inputTextCpf.sendKeys(CPF);

	}

	public void clicarContinuar() throws InterruptedException {
		btnContinuar.click();
	}

	public void escreverNome(String NomeCompleto) throws InterruptedException {

		Thread.sleep(10000);
		inputTextNomeCompleto.sendKeys(NomeCompleto);
		Thread.sleep(100);
		btnContinuar.click();
		Thread.sleep(1000);

	}

	public void escreverComoQuerSerChamado(String ComoQuerSerChamado) throws InterruptedException {

		Thread.sleep(100);
		inputTexComoQuerSerChamado.sendKeys(ComoQuerSerChamado);

	}

	public void escreverCelular(String Celular) throws InterruptedException {

		Thread.sleep(100);
		inputTexCelular.sendKeys(Celular);

	}

	public void escreverEmail(String Email) throws InterruptedException {

		Thread.sleep(100);
		inputTexEmail.sendKeys(Email);
	

	}

	public void escreverDataNascimento(String DataNascimento) throws InterruptedException {

		Thread.sleep(100);
		inputTexDataNascimento.sendKeys(DataNascimento);

	} 

	public void clicarContinuarDadosPessoais() throws InterruptedException {
		
		//moveToElement(btnContinuar);
		btnContinuar.click(); 
	}

}