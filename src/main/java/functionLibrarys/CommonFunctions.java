package functionLibrarys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.random.RandomGenerator;


public class CommonFunctions
{
    public static WebDriver driver;
    public void openHomepage()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void closeHomepage()
    {
        //driver.quit();
    }

    public void waitforElement(WebElement element)
    {
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitTime(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
    }

    public void maximize()
    {
        driver.manage().window().maximize();
    }

    public String generateRandomNumber()
    {
        String generatednumber = RandomStringUtils.randomNumeric(10);
        return(generatednumber);
    }

    public String generateRandomString()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(8);
        return(generatedString);
    }
}
