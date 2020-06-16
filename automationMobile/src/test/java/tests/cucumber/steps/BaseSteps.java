package tests.cucumber.steps;

import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Globals;
import suporte.driver.ThreadDriver;

public class BaseSteps {

    protected WebDriverWait wait;

    protected void initializeCucumber() {

        wait = new WebDriverWait(ThreadDriver.getTDriver(), Globals.TIMEOUT_DEFAUT);
    }

    protected void teardown(){
        ThreadDriver.getTDriver().quit();
    }
}
