package suporte.plataforma;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import suporte.driver.ThreadDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Globals;

import java.net.MalformedURLException;
import java.net.URL;

public class IosSupport implements IPlatform {

    public WebDriverWait wait;

    public void setupAppium() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        ThreadDriver.setTDriver(new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps));
        wait = new WebDriverWait(ThreadDriver.getTDriver(), Globals.TIMEOUT_DEFAUT);

    }
}