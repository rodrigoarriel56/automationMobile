package screens.base;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Globals;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
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

	@SuppressWarnings("rawtypes")
	public void moveToElement(MobileElement elemento) throws InterruptedException {

		TouchActions action = new TouchActions(driver);

		action.scroll(400, 0);
		Thread.sleep(1000);
		action.scroll(300, 0);
		Thread.sleep(1000);
		action.scroll(200, 0);
		Thread.sleep(1000);
		action.scroll(100, 0);
		action.perform();
		elemento.click();
		action.moveToElement(elemento, 10, 100);

	}

	static int contador = 0;
	static int miliseconds = 10000;

	@SuppressWarnings("rawtypes")
	public static void swipeVerticalParaBaixo() throws Exception {

		Dimension size = ThreadDriver.getTDriver().manage().window().getSize();
		int widthStart = size.getWidth() / 2;
		int heightStart = (int) (size.getHeight() * 0.3);
		int heightFinished = (int) (size.getHeight() * 0.9);

		TouchAction actions = new TouchAction(ThreadDriver.getTDriver());
		actions.press(PointOption.point(widthStart, heightStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(miliseconds)))
				.moveTo(PointOption.point(widthStart, heightFinished)).release().perform();

		Thread.sleep(Globals.TIMEOUT_SMALL);
	}

	public static void scrollBaixo(MobileElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scroll", scrollObject);

	}
 


}
