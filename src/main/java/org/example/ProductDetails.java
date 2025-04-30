package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductDetails {
    WebDriver driver;
    WebDriverWait wait;

    public ProductDetails(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    public void getNameAndPrice(){
        String name= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/h1/span")).getText();
        String price=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div/div/div/span")).getText();
        System.out.println("Item Name:"+ name);
        System.out.println("Item Price:"+price);
    }





}
