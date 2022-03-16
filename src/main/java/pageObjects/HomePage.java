package pageObjects;

import functionLibrarys.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonFunctions
{
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "uid")
    public WebElement userID;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(name = "btnLogin")
    public WebElement loginBtn;
    @FindBy(id="save")
    public WebElement cookies;

    public boolean assertReturnValue;

    public void acceptCookies()
    {
        driver.switchTo().frame("gdpr-consent-notice");  //switched to iframe of Accept cookies
        cookies.click();
        driver.switchTo().defaultContent();

    }

    public void enterUID(String uid)
    {
        userID.sendKeys(uid);
    }

    public void enterpassword(String pws)
    {
        password.sendKeys(pws);
    }

    public void clickSignin()
    {
        loginBtn.click();
    }

    public void loginSuccessfull(String expTitleofPage)
    {

        String actTitleofPage = driver.getTitle();
        Assert.assertEquals(expTitleofPage,actTitleofPage);
        System.out.println("valid page title:"+actTitleofPage);
    }
}
