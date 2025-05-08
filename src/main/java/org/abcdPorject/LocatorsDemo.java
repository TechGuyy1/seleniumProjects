package org.abcdPorject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//      WebDriver edgeDriver= new EdgeDriver(); --> to open edge browser
        driver.manage().window().maximize();
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
        driver.findElement(By.xpath("//option[@value='Chicago']")).click();
        driver.findElement(By.id("state")).click();
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
