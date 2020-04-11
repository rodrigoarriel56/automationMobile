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
	public MobileElement inputText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continuar']")
	public MobileElement btnContinuar;

	public void clicarBotaoMinhaConta() throws InterruptedException {
		Thread.sleep(300000);
		btnAbrirMinhaContaMidway.click();
		Thread.sleep(1000);

	}

	public void clicarBotaoEntrar() throws InterruptedException {
		Thread.sleep(10000);
		btnEntrar.click();
		Thread.sleep(1000);
	}

	public void escreverCpf(String CPF) throws InterruptedException {

		inputLabelCPF.click();
		Thread.sleep(1000);
		inputText.sendKeys(CPF);

	}

	public void clicarContinuar() throws InterruptedException {
		btnContinuar.click();
	}
	
	public void escreverNome(String NomeCompleto) throws InterruptedException {
	try {
		Thread.sleep(10000);
		inputLabelNomeCompleto.click();
		inputText.sendKeys(NomeCompleto);
		Thread.sleep(1000);
		clicarContinuar();
		Thread.sleep(1000000);
		}catch(Exception exe) {}
	
	}
}