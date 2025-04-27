package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Electronics {
    WebDriver driver;

    public Electronics(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void goToCellPhones(){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[2]/span/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li/section/div/ul/li[4]/span/a")).click();
    }
}
