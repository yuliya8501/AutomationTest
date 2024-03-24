package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.testng.Assert.*;

public class Task2 extends BaseTest {


    @Test
    public void checkboxTest() throws InterruptedException {

        String url = "https://the-internet.herokuapp.com/checkboxes";

        driver.get(url);

        WebElement checkBoxDisplayed1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        boolean isDisplayed1 = checkBoxDisplayed1.isDisplayed();
        Assert.assertEquals(checkBoxDisplayed1.isSelected(),false);
        System.out.println("Select");
        checkBoxDisplayed1.click();
        Assert.assertEquals(checkBoxDisplayed1.isSelected(),true);
        WebElement checkBoxDisplayed2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        boolean isDisplayed2 = checkBoxDisplayed2.isDisplayed();
        Assert.assertEquals(checkBoxDisplayed2.isSelected(),true);
        System.out.println("UnSelect");
        checkBoxDisplayed2.click();
        Assert.assertEquals(checkBoxDisplayed2.isSelected(),false);

   sleep(2000);

    }
}