package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void addToCart(){
        driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]")).click();
    }

    public void selectCart(){
        //driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[2]/div[5]/div/a/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gh\"]/nav/div[2]/div[5]/div/a/span"))).click();

    }
}
