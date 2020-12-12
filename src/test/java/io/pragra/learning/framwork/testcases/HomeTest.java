package io.pragra.learning.framwork.testcases;

import io.pragra.learning.framwork.config.AppConfig;
import io.pragra.learning.framwork.drivermanager.DriverManager;
import io.pragra.learning.framwork.pages.RequestDemoPage;
import io.pragra.learning.framwork.pages.TopNavBarpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HomeTest {

    private WebDriver driver = DriverManager.getDriver();

    @BeforeSuite
    public void setUp() {
        driver.get("https://zoom.us");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("truste-consent-button"))).click();
    }

    @Test
    public void testName() throws InterruptedException {
        TopNavBarpPage  topNav = new TopNavBarpPage(driver);
        RequestDemoPage requestDemoPage = topNav.clickOnRequestDemo();

        Assert.assertEquals(requestDemoPage.getRequestDemoHeader().getText(),"Request a Demo");

        requestDemoPage
                .enterEmail("geet@learning.com")
                .company("NuIndia")
                .firstName("Geet")
                .lastName("Saxena")
                .clickSubmit();



    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
