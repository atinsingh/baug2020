package io.pragra.learning.framwork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavBarpPage {

    private WebDriver driver;

    @FindBy(css = "#black-topbar>div>ul>li:nth-child(1)")
    private WebElement requestDemoLink;

    @FindBy(css = "#black-topbar>div>ul>li:nth-child(2)")
    private WebElement one888Link;

    @FindBy(css = "#black-topbar>div>ul>li:nth-child(3)")
    private WebElement resoucesHoverLink;

    @FindBy(css = "#black-topbar>div>ul>li:nth-child(3)")
    private WebElement supportLink;

    @FindBy(css = "#resourcesDropdown>li:nth-child(1)>a")
    private WebElement downLoadZoomLink;

    public TopNavBarpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getRequestDemoLink() {
        return requestDemoLink;
    }

    public WebElement getOne888Link() {
        return one888Link;
    }

    public WebElement getResoucesHoverLink() {
        return resoucesHoverLink;
    }

    public WebElement getSupportLink() {
        return supportLink;
    }

    public WebElement getDownLoadZoomLink() {
        return downLoadZoomLink;
    }

    public RequestDemoPage clickOnRequestDemo() {
        this.requestDemoLink.click();
        return new RequestDemoPage(driver);
    }


}
