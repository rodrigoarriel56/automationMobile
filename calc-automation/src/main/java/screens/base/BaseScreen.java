package screens.base;

import static java.time.Duration.ofMillis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Globals;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import suporte.driver.ThreadDriver;

public class BaseScreen {

	protected static MobileDriver<MobileElement> driver;
	public MobileElement _elemento;
	protected WebDriverWait wait;

	public BaseScreen(AppiumDriver<MobileElement> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(Globals.TIMEOUT_DEFAUT, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}

	public void setWait(int time) {
		this.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	static int contador = 0;
	static int miliseconds = 400;

	@SuppressWarnings("rawtypes")
	public static void swipeVerticalParaCima() throws Exception {

		Dimension size = ThreadDriver.getTDriver().manage().window().getSize();
		int widthStart = size.getWidth() / 2;
		int heightStart = (int) (size.getHeight() * 0.7);

		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.press(PointOption.point(widthStart, heightStart))
				.waitAction(WaitOptions.waitOptions(ofMillis(miliseconds))).moveTo(PointOption.point(widthStart, 10))
				.release().perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	@SuppressWarnings("rawtypes")
	public static void swipeVerticalParaBaixo() throws Exception {

		Dimension size = ThreadDriver.getTDriver().manage().window().getSize();
		int widthStart = size.getWidth() / 2;
		int heightStart = (int) (size.getHeight() * 0.3);
		int heightFinished = (int) (size.getHeight() * 0.9);

		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.press(PointOption.point(widthStart, heightStart))
				.waitAction(WaitOptions.waitOptions(ofMillis(miliseconds)))
				.moveTo(PointOption.point(widthStart, heightFinished)).release().perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	@SuppressWarnings("rawtypes")
	public static void swipe(int widthStart, int heightStart, int widthFinish, int heightFinish) throws Exception {
		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.press(PointOption.point(widthStart, heightStart))
				.waitAction(WaitOptions.waitOptions(ofMillis(miliseconds)))
				.moveTo(PointOption.point(widthFinish, heightFinish)).release().perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	@SuppressWarnings("rawtypes")
	public static void swipeHorizontalParaEquerda() throws Exception {

		Dimension size = ThreadDriver.getTDriver().manage().window().getSize();
		int widthStart = (int) (size.getWidth() * 0.7);
		int heightStart = (size.getHeight() / 2);

		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.press(PointOption.point(widthStart, heightStart))
				.waitAction(WaitOptions.waitOptions(ofMillis(miliseconds))).moveTo(PointOption.point(10, heightStart))
				.release().perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	@SuppressWarnings("rawtypes")
	public static void swipeHorizontalParaDireita() throws Exception {

		Dimension size = ThreadDriver.getTDriver().manage().window().getSize();
		int widthStart = (int) (size.getWidth() * 0.3);
		int heightStart = (size.getHeight() / 2);
		int widthFinish = (int) (size.getWidth() * 0.9);

		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.press(PointOption.point(widthStart, heightStart))
				.waitAction(WaitOptions.waitOptions(ofMillis(miliseconds)))
				.moveTo(PointOption.point(widthFinish, heightStart)).release().perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	@SuppressWarnings("rawtypes")
	public static void tapCentroObjeto(MobileElement objeto) throws Exception {
		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.tap(PointOption.point(objeto.getCenter().getX(), objeto.getCenter().getY())).perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	public static boolean elementoExiste(MobileElement objeto) {
		try {

			objeto.isDisplayed();

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean elementoExiste(MobileElement objeto, int timeout) {
		try {
			BaseScreen base = new BaseScreen(ThreadDriver.getTDriver());
			base.setWait(timeout);
			objeto.isDisplayed();
			base.setWait(Globals.TIMEOUT_DEFAUT);
		} catch (Exception e) {
			BaseScreen base = new BaseScreen(ThreadDriver.getTDriver());
			base.setWait(Globals.TIMEOUT_DEFAUT);
			return false;
		}
		return true;
	}

	public static String obterMassaDados(String chave) {
		return Globals.MASSA_DADOS.get(chave).toString();
	}

	@SuppressWarnings("unchecked")
	public static void setMassaDados(String chave, String valor) {
		Globals.MASSA_DADOS.put(chave, valor);
	}

	public static String numerosAleatorio(int tamanho) {
		String numeros = "123456789";
		String aleatorio = "";
		for (int i = 0; i < tamanho; i++) {
			int rnum = (int) Math.floor(Math.random() * numeros.length());
			aleatorio += numeros.substring(rnum, rnum + 1);
		}
		return aleatorio;
	}

	public static String textoAleatorio(int tamanho) {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz";
		String aleatorio = "";
		for (int i = 0; i < tamanho; i++) {
			int rnum = (int) Math.floor(Math.random() * letras.length());
			aleatorio += letras.substring(rnum, rnum + 1);
		}
		return aleatorio;
	}
}
