package org.example.ReusableMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.example.Constants.WAIT_DURATION;
import static org.example.Driver.getDriver;

public class WaitUtility {

public void webDriverWait(Object webElement,String condition) {

    WebDriverWait wait = null;

    if (!condition.isEmpty()) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_DURATION));
    }

    switch (condition) {
        case "visibility" -> wait.until(ExpectedConditions.visibilityOfAllElements((WebElement) webElement));
        case "clickability" -> wait.until(ExpectedConditions.elementToBeClickable((WebElement) webElement));
        case "" -> getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_DURATION));
    }

    }
}
