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

public class Task1 extends BaseTest {

    /*private Object By;*/

    @Test
    public void buttonTest() throws InterruptedException {




        String url = "https://the-internet.herokuapp.com/add_remove_elements/";

        driver.get(url);

        WebElement addButton = driver.findElement(org.openqa.selenium.By.cssSelector("button"));
        assertTrue(addButton.isDisplayed());
        sleep(100);
        addButton.click();
        sleep(100);
        WebElement deleteButton = driver.findElement(org.openqa.selenium.By.className("added-manually"));
        sleep(100);
        Assert.assertTrue(driver.findElement(org.openqa.selenium.By.className("added-manually")).isDisplayed(),"Visible");
        sleep(100);

        deleteButton.click();
       Assert.assertFalse(driver.findElement(org.openqa.selenium.By.className("added-manually")).isDisplayed(),"Not visible");
        sleep(100);



    }

}