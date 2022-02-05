package com.hudl.test.stepsFiles;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {

    public LoginPage loginPage;
    public LoginPageSteps(LoginPage loginPage)
    {
        this.loginPage=loginPage;
    }


    @When("^I enter email id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterEmailIdAndPassword(String emailId, String password) throws Throwable {
        loginPage.enterEmailId(emailId);
        loginPage.enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("^Login page should be displayed\\.$")
    public void loginPageShouldBeDisplayed() throws Exception{

        //Assert.assertEquals("Log In - Hudl", loginPage.getPageTitle());
        Assert.assertEquals(loginPage.getPageTitle(),"Home - Hudl");

    }

    @Given("^i navigate to the \"([^\"]*)\" page$")
    public void iNavigateToThePage(String arg0) throws Throwable {
        loginPage.startDriver();
    }

    @Then("^Login error should be displayed\\.$")
    public void loginErrorShouldBeDisplayed() throws Exception{
        Assert.assertEquals(loginPage.getLoginErrorMessage(),"We didn't recognize that email and/or password. Need help?");

    }
}

