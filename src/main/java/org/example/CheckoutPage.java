package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;


    private final By firstNamePath = By.name("firstName");
    private final By lastNamePath = By.name("lastName");
    private final By addressPath1 = By.name("addressLine1");
    private final By addressPath2 = By.name("addressLine2");
    private final By cityPath = By.name("city");
    private final By stateOrProvincePath = By.name("stateOrProvince");
    private final By postalCodePath = By.name("postalCode");
    private final By emailPath = By.name("email");
    private final By emailConfirmPath = By.name("emailConfirm");
    private final By phoneNumberPath = By.name("phoneNumber");


  
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    public void getTotal(){
        String total=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[2]/div/div/div[1]/div[3]/div[2]/span/span/span"))).getText();
        System.out.println("Total:"+total);
    }

    public void checkout(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[2]/div/div/div[2]/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gxo-btn\"]"))).click();

    }

    public void fillCheckoutForm(String firstName, String lastName,String address1,String address2, String city,String stateOrProvince, String postalCode,String email,String emailConfirm,String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNamePath)).sendKeys(firstName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNamePath)).sendKeys(lastName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressPath1)).sendKeys(address1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressPath2)).sendKeys(address2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityPath)).sendKeys(city);
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateOrProvincePath)).sendKeys(stateOrProvince);
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalCodePath)).sendKeys(postalCode);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailPath)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailConfirmPath)).sendKeys(emailConfirm);
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberPath)).sendKeys(phoneNumber);




    }


  

}
