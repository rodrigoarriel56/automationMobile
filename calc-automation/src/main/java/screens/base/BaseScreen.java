package screens.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
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
	public void moveToElement(MobileElement elemento) throws InterruptedException {
		
		TouchActions action = new TouchActions(driver);
	
		action.scroll(400,0 );
		Thread.sleep(1000);
		action.scroll(300,0 );
		Thread.sleep(1000);
		action.scroll(200,0 );
		Thread.sleep(1000);
		action.scroll(100,0 );
//		action.perform();
//		elemento.click();
//		action.moveToElement(elemento, 10, 100);
	

		
	}
	
}
