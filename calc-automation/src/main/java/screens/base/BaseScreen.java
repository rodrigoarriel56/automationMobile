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

	
}
