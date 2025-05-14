package org.abcdPorject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollDemoUsingJsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tradingview.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[@data-main-menu-root-track-id='community']")).click();
       //Using javascript Executor
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,30000);");//y- Vertical scroll down
        Thread.sleep(3000);
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-1500);");//y- Vertical scroll up
        js.executeScript("window.scrollBy(2000,0);");//x- horizantal scroll
    }
}
