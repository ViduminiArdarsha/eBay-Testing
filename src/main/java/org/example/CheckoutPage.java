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

     guestEmailPath= By.name("firstName");

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

    public void fillCheckoutForm(String email, String firstName, String lastName,
                                 String address, String city, String state, String zip) {
        wait.until(ExpectedConditions.visibilityOf(guestEmailPath)).sendKeys(email);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        stateInput.sendKeys(state);
        zipCodeInput.sendKeys(zip);


    }


}
