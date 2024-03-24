package webelementtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Objects;

import static java.lang.Thread.sleep;

public abstract class BaseTest {

protected WebDriver driver;
    protected WebDriver driverWait;

    @BeforeMethod(alwaysRun = true)
    public void initiateDriver() throws InterruptedException {
driver = new ChromeDriver();
sleep(100);

    }

  @AfterMethod(alwaysRun = true)
        public void closeDriver(){
        if (Objects.nonNull(driver)){
            driver.quit();
        }
    }

}
