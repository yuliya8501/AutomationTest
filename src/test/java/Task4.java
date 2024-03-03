
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Task4 {

    private Object By;

    @Test
    public void inputTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.out.println("Started");
        sleep(1000);
        String url = "https://the-internet.herokuapp.com/inputs";

        driver.get(url);
        sleep(1000);

        System.out.println("Page is opened");
        try {
            sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        WebElement ele = driver.findElement(org.openqa.selenium.By.xpath("//input"));
        Assert.assertTrue(ele.isDisplayed());

        ele.sendKeys("12");
        String val = ele.getAttribute("value");

        sleep(500);
        System.out.println("Entered text is: " + val);
        sleep(100);
        driver.quit();



    }
}

