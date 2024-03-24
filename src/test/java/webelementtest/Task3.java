package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class Task3 extends BaseTest {



    @Test
    public void drpTest() throws InterruptedException {


        String url = "https://the-internet.herokuapp.com/dropdown";

        driver.get(url);

        Select drpElem = new Select(driver.findElement(By.id("dropdown")));

        drpElem.selectByIndex(1);
        drpElem.getFirstSelectedOption();

        sleep(100);


    }

}