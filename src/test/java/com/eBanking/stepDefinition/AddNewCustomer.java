package com.eBanking.stepDefinition;

import functionLibrarys.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewCustomerPage;

public class AddNewCustomer extends CommonFunctions {
    AddNewCustomerPage addNewCustomerPage = new AddNewCustomerPage(driver);
    @When("I click on New Customer tab to add new customer")
    public void i_click_on_new_customer_tab_to_add_new_customer() {
        addNewCustomerPage.clickNewCustomer();

    }

    @When("I enter customer name {string}")
    public void i_enter_customer_name(String name) {
        addNewCustomerPage.enterCustomerName(name);
    }

    @When("I enter Gender {string}")
    public void i_enter_gender(String cgender) {
        addNewCustomerPage.enterGender(cgender);
    }

    @When("I enter Date of birth {string} {string} {string}")
    public void i_enter_date_of_birth(String dd, String mm, String yyyy) {
        addNewCustomerPage.enterdateofBirth(dd,mm,yyyy);
    }

    @When("I enter Address {string}")
    public void i_enter_address(String address) {
        addNewCustomerPage.enteraddress(address);
    }

    @When("I enter city {string}")
    public void i_enter_city(String city) {
        addNewCustomerPage.entercity(city);
    }

    @When("I enter state {string}")
    public void i_enter_state(String state) {
        addNewCustomerPage.enterState(state);
    }

    @When("I enter PIN {string}")
    public void i_enter_pin(String pin) {
        addNewCustomerPage.enterpin(pin);

    }

    @When("I enter mobile number")
    public void i_enter_mobile_number() {
        addNewCustomerPage.enterMobile();
    }

    @When("I enter E-Mail")
    public void i_enter_e_mail() {
        addNewCustomerPage.enterEmail();
    }

    @When("I enter Password {string}")
    public void i_enter_password(String pwd) {
        addNewCustomerPage.enterPassword(pwd);
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        addNewCustomerPage.clicksubmit();
    }

    @Then("New Customer should be created successfully with message as {string}")
    public void new_customer_should_be_created_successfully_with_message_as(String msg) {
        addNewCustomerPage.successfulCustomer(msg);
    }



}
