package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.base.BaseScreen;
import suporte.Utils;

public class CalcScreen extends BaseScreen {

	public CalcScreen(AppiumDriver<MobileElement> driver) throws Exception {
		super(driver);

		if (!_btnSomar.isDisplayed()) {
			throw new Exception("");
		}
	}

	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='plus']")
	public MobileElement _btnSomar;

	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='minus']")
	public MobileElement _btnSubtrair;

	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='multiply']")
	public MobileElement _btnMultiplicar;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='divide']")
	public MobileElement _btnDividir;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='delete']")
	public MobileElement _btnDeletar;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='equals']")
	public MobileElement _btnIgual;
	
	
	public void clicarNumero(String num) {
		driver.findElementByXPath("//android.widget.Button[contains(@text,'"+num+"')]").click();
	}
	
	public String pegarResultado() {
		String text = driver.findElementById("com.android.calculator2:id/result").getText();
		return text;
	}
	
	public void somarInteiros() {
		clicarNumero(Utils.obterMassaDados("um"));
		_btnSomar.click();
		clicarNumero(Utils.obterMassaDados("seis"));
		_btnIgual.click();
	}
}
