package suporte.plataforma;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import suporte.driver.ThreadDriver;

public class AndroidSupport implements IPlatform {

    public WebDriverWait wait;

    public void setupAppium() throws IOException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.ctappium");
		caps.setCapability("appActivity", "com.ctappium.MainActivity"); 
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("avd", "teste01");
		
		ThreadDriver.setTDriver(new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps));
		wait = new WebDriverWait(ThreadDriver.getTDriver(), 10);
    }
}
