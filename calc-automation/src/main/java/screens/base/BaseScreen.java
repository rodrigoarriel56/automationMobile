package screens.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Globals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static suporte.driver.ThreadDriver.getTDriver;

public class BaseScreen {

	protected MobileDriver<MobileElement> driver;
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
	public void scroll(double inicio, double fim) {

		Dimension size = getTDriver().manage().window().getSize();

		int x = size.width / 2;

		int start_y = (int) (size.height * inicio);

		int end_y = (int) (size.height * fim);

		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(1280, 1013)).perform() 

		.press(x, start_y).waitAction(Duration.ofMillis(500)).moveTo(x, end_y).release().perform();

	}
	

	public void scrollDown() {

		scroll(0.9, 0.1); 

	}

	public void scrollUp() {

		scroll(0.1, 0.9);

	}

}
