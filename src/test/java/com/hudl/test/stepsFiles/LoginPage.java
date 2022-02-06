package com.hudl.test.stepsFiles;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(id="email")
    private WebElement emailID;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="logIn")
    private WebElement loginButton;
    @FindBy(css="form.login-container div.login-error div.login-error-container p")
    private WebElement loginErrorMessage;



    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.hudl.com/login");
        PageFactory.initElements(driver, this);
    }
public String getLoginErrorMessage() throws Exception
{
    waitTime(3);
    return loginErrorMessage.getText();
}
    public void enterEmailId(String emailValue) {
        emailID.sendKeys(emailValue);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLoginButton() {
        loginButton.click();
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