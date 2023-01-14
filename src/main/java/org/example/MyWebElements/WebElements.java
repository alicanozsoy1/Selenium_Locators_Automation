package org.example.MyWebElements;

import org.example.ClassObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.Driver.getDriver;

public class WebElements extends ClassObjects {

    public static By searchBar_ClassName;
    public static WebElement searchBar;
    public static By advancedSearch_XPath;
    public static WebElement advancedSearch;
    public static By userName_Id;
    public static WebElement userName;
    public static By searchButton_CssSelector;
    public static WebElement searchButton;
    public static By userName_TagName;
    public static WebElement userName_AdvancedSearch;
    public static By repoName_LinkText;
    public static WebElement repoName;
    public static By playButton_CssSelector;
    public static WebElement playButton;
    public static By starButton_XPath;
    public static WebElement starButton;
    public static By loginField_Id;
    public static WebElement login;
    public static By flashError_ClassName;
    public static WebElement flashError;
    public static By forgotPassword_PartialLinkText;
    public static WebElement forgotPassword;
    public static WebElement element=null;

    public static WebElement getWebElement(String webElement) throws WebElementNameIsWrongException {

        switch (webElement) {

            case "searchBar" -> {
                searchBar_ClassName = By.className("form-control");
                searchBar = getDriver().findElement(searchBar_ClassName);
                element = searchBar;
            }

            case "advancedSearch" -> {
                advancedSearch_XPath = By.xpath("//div[3]/div/div/a");
                advancedSearch = getDriver().findElement(advancedSearch_XPath);
                element = advancedSearch;
            }

            case "userName" -> {
                userName_Id = By.id("search_full_name");
                waitUtility.webDriverWait("","");
                userName = getDriver().findElement(userName_Id);
                element = userName;
            }

            case "searchButton" -> {
                searchButton_CssSelector = By.cssSelector("button.btn[type=\"submit\"]");
                searchButton = getDriver().findElement(searchButton_CssSelector);
                element = searchButton;
            }

            case "userName_AdvancedSearch" -> {
                userName_TagName = By.tagName("em");
                userName_AdvancedSearch = getDriver().findElement(userName_TagName);
                element = userName_AdvancedSearch;
            }

            case "repoName" -> {
                repoName_LinkText = By.linkText("SwiftChatClone");
                repoName = getDriver().findElement(repoName_LinkText);
                element = repoName;
            }

            case "playButton" -> {
                playButton_CssSelector = By.cssSelector("button.AnimatedImagePlayer-button[data-target=\"animated-image.playButton\"]");
                playButton = getDriver().findElement(playButton_CssSelector);
                element = playButton;
            }

            case "starButton" -> {
                starButton_XPath = By.xpath("//li[3]/div/a");
                starButton = getDriver().findElement(starButton_XPath);
                waitUtility.webDriverWait(starButton,"clickability");
                element = starButton;
            }

            case "login" ->{
                loginField_Id = By.name("login");
                login = getDriver().findElement(loginField_Id);
                element = login;
            }

            case "flashError" -> {
                flashError_ClassName = By.className("flash");
                flashError = getDriver().findElement(flashError_ClassName);
                waitUtility.webDriverWait(flashError,"visibility");
                element = flashError;
            }

            case "forgotPassword" -> {
                forgotPassword_PartialLinkText = By.partialLinkText("password?");
                forgotPassword = getDriver().findElement(forgotPassword_PartialLinkText);
                element = forgotPassword;
            }

            default -> throw new WebElementNameIsWrongException("The parameter you have given does not match the existing ones!");
        }

        return element;
    }
}
