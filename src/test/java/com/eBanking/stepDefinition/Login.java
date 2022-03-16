package com.eBanking.stepDefinition;


import functionLibrarys.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import pageObjects.HomePage;

public class Login extends CommonFunctions {
    HomePage homePage = new HomePage(driver);

    @Given("I should be on home page {string}")
    public void i_should_be_on_home_page(String url) throws Throwable {
        driver.get(url);
        maximize();
        waitTime(5);
        homePage.acceptCookies();

    }

    @When("I enter UserID as {string}")
    public void i_enter_user_id_as(String uid) throws Throwable {
        homePage.enterUID(uid);
    }

    @When("I enter Password as {string}")
    public void i_enter_password_as(String pwd) throws Throwable {
        homePage.enterpassword(pwd);
    }

    @When("I click on LogIn")
    public void i_click_on_log_in() throws Throwable {
        homePage.clickSignin();
    }

    @Then("I should be loggedIn successfully with page title as {string}")
    public void i_should_be_logged_in_successfully_with_page_title_as(String titleofPage) throws Throwable {
        homePage.loginSuccessfull(titleofPage);
    }

}




