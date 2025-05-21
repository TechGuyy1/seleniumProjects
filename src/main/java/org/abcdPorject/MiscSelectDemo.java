package org.abcdPorject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MiscSelectDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String menuName= "GIFT CARDS";
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Actions ac= new Actions(driver);
//        WebElement compOption= driver.findElement(By.xpath("(//a[contains(text(),'Comp')])[1]"));
////      ac.clickAndHold(compOption).perform();
//        ac.moveToElement(compOption).perform();
//        driver.findElement(By.xpath("(//ul[@class='top-menu']//li//a)[3]")).click();
//        driver.findElement(By.xpath(" (//ul//a[@href='/desktops'])[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[4]"));
       List<WebElement> menuOptions= driver.findElements(By.xpath("//ul[@class='top-menu']//li//a"));
      for(int i=0;i<menuOptions.size();i++){
     if(menuOptions.get(i).getText().equalsIgnoreCase(menuName)){
        Thread.sleep(2000);
        System.out.println("Element Text :"+menuOptions.get(i).getText());
        menuOptions.get(i).click();
    }
      }
    }
}
