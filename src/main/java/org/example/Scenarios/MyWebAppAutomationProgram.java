package org.example.Scenarios;
import org.example.ClassObjects;
import org.example.Constants;
import org.openqa.selenium.Keys;

public class MyWebAppAutomationProgram extends ClassObjects {

    public static void main(String[] args) {

        methods.launchChromeBrowser(Constants.URL1); //STEP-1: Launch Chrome and go to https://github.com/
        methods.clickToLocater("searchBar");  //STEP-2: Locate and click to searchBar
        methods.sendKeysToTextBox("searchBar",Constants.SEARCH); //STEP-3: Write the name to the searchbar
        methods.enter("searchBar",Keys.ENTER);  //STEP-4: Click enter to search the name
        methods.clickToLocater("advancedSearch");  //STEP-5: Locate and click to advanced search bar
        methods.sendKeysToTextBox("userName",Constants.USER_NAME);  //STEP-6: Write the user name to full name bar
        methods.clickToLocater("searchButton"); //STEP-7: Click to search button
        methods.clickToLocater("userName_AdvancedSearch");  //STEP-8: click to user name
        methods.clickToLocater("repoName");  //STEP-9: Click to first repository
        methods.clickToLocater("playButton");  //STEP-10: Click to gif play button
        methods.clickToLocater("starButton");  //STEP-11: Click to star button
        methods.clickToLocater("login");
        methods.sendKeysToTextBox("login","automationtest@gmail.com");
        methods.enter("login",Keys.ENTER);
        methods.visibility("flashError","forgotPassword");

    }

}
