package com.hudl.test.stepsFiles;

import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;
    private final By emailID = By.id("email");
    private final By password = By.id("password");
    private final By loginButton = By.id("logIn");
    private final By loginErrorMessage = By.cssSelector("form.login-container div.login-error div.login-error-container p");

    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.hudl.com/login");

    }
public String getLoginErrorMessage() throws Exception
{
    waitTime(3);
    return driver.findElement(loginErrorMessage).getText();
}
    public void enterEmailId(String emailValue) {
        driver.findElement(emailID).sendKeys(emailValue);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getPageTitle() throws Exception {
        waitTime(5);
        return driver.getTitle();
    }

    public void waitTime(int seconds) throws Exception {
        Thread.sleep(seconds * 1000);
    }

    @After
    public void quit() {
        driver.quit();
    }


}