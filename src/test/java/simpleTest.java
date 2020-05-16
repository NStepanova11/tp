import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class simpleTest {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @BeforeSuite
    public void setWebDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void loadPage(){
        driver.get("https://www.youtube.com/");
        wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/"));
    }
/*
    @Test(priority = 2)
    public void checkPage(){
        Assert.assertEquals(driver.getCurrentUrl(), "hello");
    }
*/
    @AfterSuite
    public void closeWebDriver(){
        driver.close();
    }
}
