package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Electronics {
    WebDriver driver;
    WebDriverWait wait;


    public Electronics(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);

    }

    public void clickCellPhonesAndAccessories() {
        driver.findElement(By.xpath("//*[@class=\"brw-region brw-region--left\"]/section/div/ul/li[2]/span/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li/section/div/ul/li[4]/span/a")).click();

    }

    public void selectSize() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"brw-refinement-root\"]/div/ul/li[1]/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/section[3]/div[1]/div/div[2]/div[3]/div/div[8]/button"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"seo-accordion__sect-7\"]/div/fieldset/div/ul/li[1]/div/span"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/section[3]/div[1]/div/div[2]/div[4]/div/div/button"))).click();


    }

    public void selectProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/section[3]/section[3]/ul/li[1]/div/div/div[2]/div[1]/div[1]/span/a"))).click();
    }
}