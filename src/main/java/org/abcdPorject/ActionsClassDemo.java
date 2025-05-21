package org.abcdPorject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
    WebDriver driver;
    public void navigateToUrl(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Actions actions= new Actions(driver);

        WebElement compOption= driver.findElement(By.xpath("(//a[contains(text(),'Comp')])[1]"));
        actions.moveToElement(compOption).perform();
        this.driver=driver;
    }
    public void clickOnComputersOptions(String option){
//        driver.findElement(By.xpath(" (//ul//a[@href='/"+option+"'])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'"+option+"')])[1]")).click();
//        (//a[contains(text(),'Accessories')])[1]

    }
    public static void main(String[] args) {
        ActionsClassDemo obj = new ActionsClassDemo();
        obj.navigateToUrl();
        obj.clickOnComputersOptions("Note");

    }

}
