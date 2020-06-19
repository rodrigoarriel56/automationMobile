package suporte.driver;

import java.io.Console;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ThreadDriver {

    private static ThreadLocal<AppiumDriver<MobileElement>> _driver = new ThreadLocal<AppiumDriver<MobileElement>>();

    public synchronized static void setTDriver(AppiumDriver<MobileElement> driver) {
        _driver.set(driver);
    }

    public synchronized static AppiumDriver<MobileElement> getTDriver() {
        return _driver.get();
    }
    
}
