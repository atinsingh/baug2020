package io.pragra.learning.framwork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinMeetingPage {

    private WebDriver driver;

    @FindBy(css = "#join-conf .page-header>h1")
    private WebElement joinHeader;

    @FindBy(id = "join-confno")
    private WebElement meetingInput;

    @FindBy(id = "btnSubmit")
    private WebElement btnSubmit;

    public JoinMeetingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
