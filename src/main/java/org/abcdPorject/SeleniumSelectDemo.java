package org.abcdPorject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;
import java.util.List;

public class SeleniumSelectDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//      WebDriver edgeDriver= new EdgeDriver(); --> to open edge browser
        driver.manage().window().maximize();
        String citNm = "Chicago";
        driver.get("https://techguyy1.github.io/techguys/");
//      Identifying element by using different types of selector
        driver.findElement(By.id("practice-tab")).click();
        driver.findElement(By.cssSelector("#userDetails-1")).click();
        driver.findElement(By.cssSelector(".fst-name")).sendKeys("Pavankumar");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Metikela");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("address1")).sendKeys("Bagmanae Layout");
        driver.findElement(By.id("address2")).sendKeys("T2111");
        driver.findElement(By.id("city")).click();
        List<WebElement> listWebElement= driver.findElements(By.xpath("//select[@id='city']//option"));
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(2));
        wt.until(ExpectedConditions.visibilityOfAllElements(listWebElement));
        for(int i=0;i<listWebElement.size();i++){
            if(listWebElement.get(i).getText().equalsIgnoreCase(citNm)){
                listWebElement.get(i).click();
            }
            else{
                System.out.println("City Name not found :)");
            }
        }
//        Select selectCity=new Select(city);
//        selectCity.selectByValue(citNm);
//        String xpt="//option[@value='Chicago']";
        citNm="//option[@value='"+citNm+"']";
//        driver.findElement(By.xpath('"'+citNm+'"')).click();////option[@value='"+citNm+"']-->"//option[@value='"+citNm+"']"
//        driver.findElement(By.id("state")).click();

        Select selectState=new Select(driver.findElement(By.cssSelector("#state")));
        selectState.selectByIndex(1);
        driver.findElement(By.xpath("//option[@value='NY']")).click();
        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//option[@value='USA']")).click();
        driver.findElement(By.xpath("//input[@id='phone-number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//      driver.findElement(By.cssSelector(".close-btn")).click(); -->Using css selector
        driver.findElement(By.xpath("//button[@class='close-btn']")).click(); //-->Using xpath
        driver.findElement(By.partialLinkText("navigate back")).click();
    }
}
