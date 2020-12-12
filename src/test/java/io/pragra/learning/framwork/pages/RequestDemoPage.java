package io.pragra.learning.framwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestDemoPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "#content h2.fromNormal")
    private WebElement requestDemoHeader;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "btnSubmit")
    private WebElement submitBtn;



    public RequestDemoPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
        PageFactory.initElements(driver, this);
    }

    public WebElement getRequestDemoHeader() {
        return requestDemoHeader;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }


    public RequestDemoPage enterEmail(String email) {
        this.email  = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        this.email.sendKeys(email);
        return this;
    }

    public RequestDemoPage company(String company) {
        this.company.sendKeys(company);
        return this;
    }

    public RequestDemoPage firstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public RequestDemoPage lastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public void clickSubmit() {
        this.submitBtn.click();
    }
}
