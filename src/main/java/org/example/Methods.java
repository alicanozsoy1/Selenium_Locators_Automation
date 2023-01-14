package org.example;

import org.openqa.selenium.Keys;
import static org.example.Driver.getDriver;
import static org.example.MyWebElements.WebElements.*;

public class Methods extends ClassObjects{

    public void launchChromeBrowser(String url){
        try {
            getDriver().get(url);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void clickToLocater(String webElement) {
        try {
            getWebElement(webElement).click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void sendKeysToTextBox(String webElement,String str) {
        try {
            getWebElement(webElement).sendKeys(str);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void enter(String webElement,Keys key) {
        try {
            getWebElement(webElement).sendKeys(key);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void visibility(String webElement,String webElement2) {
        try {
            if (getWebElement(webElement).isDisplayed()) {
                clickToLocater(webElement2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
