package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void verifyUrl(String url){
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(url)) {
            System.out.println("Verification Successful - The correct Url is opened.");
        } else {
            System.out.println("Verification Failed - An incorrect Url is opened.");

            System.out.println("Actual URL is : " + actualUrl);
            System.out.println("Expected URL is : " + url);
        }
    }

    public void clickElectronics() {
        driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
