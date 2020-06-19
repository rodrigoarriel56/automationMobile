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
		caps.setCapability("deviceName", "H1AXB601D953PN8"); 
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("app", "C:\\GitMobile\\App\\app-qa-release.apk");
	//	caps.setCapability("appPackage", "com.midway.bank.MainActivity");
	//	caps.setCapability("appActivity", "com.midway.bank.MainActivity.MainActivity");
	    caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("avd", "teste02"); 
		
		ThreadDriver.setTDriver(new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps));
		wait = new WebDriverWait(ThreadDriver.getTDriver(), 10);
    }
}
