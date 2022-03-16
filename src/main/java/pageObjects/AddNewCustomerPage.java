package pageObjects;

import functionLibrarys.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage extends CommonFunctions {
    public AddNewCustomerPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "name")
    public WebElement txtname;
    @FindBy(name = "rad1")
    public WebElement rGender;
    @FindBy(id = "dob")
    public WebElement dob;
    @FindBy(name = "addr")
    public WebElement txtAddress;
    @FindBy(name = "city")
    public WebElement txtcity;
    @FindBy(name = "state")
    public WebElement txtState;
    @FindBy(name = "pinno")
    public WebElement txtPIN;
    @FindBy(name = "telephoneno")
    public WebElement txtMobileNumber;
    @FindBy(name = "emailid")
    public WebElement txtEmail;
    @FindBy(name = "password")
    public WebElement txtPassword;
    @FindBy(name = "sub")
    public WebElement btnSubmit;
    @FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully!!!')]")
    public WebElement message;
    @FindBy(xpath = "//a[contains(text(),'New Customer')]")
    public WebElement newCustomer;

    public void clickNewCustomer()
    {
        newCustomer.click();
    }

    public void enterCustomerName(String name)
    {
        txtname.sendKeys(name);
    }

    public void enterGender(String gender)
    {
        waitTime(20);
        rGender.click();
    }

    public void enterdateofBirth(String mm, String dd,String yyyy)
    {
        waitTime(20);
        dob.sendKeys(mm);
        dob.sendKeys(dd);
        dob.sendKeys(yyyy);
    }

    public void enteraddress(String add)
    {
        waitTime(20);
        txtAddress.sendKeys(add);
    }

    public void entercity(String city)
    {
        waitTime(20);
        txtcity.sendKeys(city);
    }

    public void enterState(String st)
    {
        waitTime(20);
        txtState.sendKeys(st);
    }

    public void enterpin(String pincode)
    {
        waitTime(20);
        txtPIN.sendKeys(pincode);
    }
    public void enterMobile()
    {
        waitTime(20);
        txtMobileNumber.sendKeys(generateRandomNumber()); //random number generated for mobile number
    }

    public void enterEmail()
    {
        waitTime(20);
        String email = generateRandomString()+"@gmail.com";  //it will generate random emailids
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String pass)
    {
        waitTime(20);
        txtPassword.sendKeys(pass);
    }

    public void clicksubmit()
    {
        btnSubmit.click();
    }

    public void successfulCustomer(String expmsg)
    {
        String actmsg = message.getText();
        Assert.assertEquals(expmsg,actmsg);
    }


}
