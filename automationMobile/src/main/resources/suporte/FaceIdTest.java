package suporte;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import suporte.driver.ThreadDriver;
import suporte.plataforma.AndroidSupport;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FaceIdTest {

	@SuppressWarnings("rawtypes")
	

	@Test
	public void testFaceId() throws Exception {
		
		AppiumDriver driver;
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
			caps.setCapability("deviceName", "emulator-5554");
			caps.setCapability("automationName", "UiAutomator2");
			caps.setCapability("app", "C:\\GitMobile\\App\\app-qa-release.apk");
			caps.setCapability("autoGrantPermissions", true);
			caps.setCapability("avd", "teste01");

			try {

				driver = ThreadDriver.getTDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//driver.executeScript("mobile:enrollBiometric", ImmutableMap.of("isEnabled", true));

				// Perform passing faceid authentication
				driver.executeScript("mobile:sendBiometricMatch", ImmutableMap.of("type", "touchId", "match", true));

				// Perform failing faceid authentication
				driver.executeScript("mobile:sendBiometricMatch", ImmutableMap.of("type", "touchId", "match", false));
				Thread.sleep(2000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

