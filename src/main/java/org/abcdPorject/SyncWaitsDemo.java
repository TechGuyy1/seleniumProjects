package org.abcdPorject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class SyncWaitsDemo {
    public static void main(String[] args) throws InterruptedException {
        //How to navigate or launch
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tradingview.com/");
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[@data-main-menu-root-track-id='community']")).click();
        //Explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        //We must need to provide expected conditions while using the explicit wait.
        WebElement editorsPics= driver.findElement(By.xpath("(//span[contains(text(),'picks')])[1]"));
        driver.findElements(By.xpath(" //*[@class='container-vJbfmS16 quote-ticker-inited']"));
        wait.until(ExpectedConditions.visibilityOf(editorsPics));
        //visibility (visible to end user)- state of element
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath(" //*[@class='container-vJbfmS16 quote-ticker-inited']"))));
        //presence - state of element
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[contains(text(),'picks')])[1]")));
        driver.findElement(By.xpath("(//span[contains(text(),'picks')])[1]")).click();
         //Thread.sleep()

        Thread.sleep(2000);//-->
         //Fluent wait --> Check the visibility of elements  in intervals

    }
}
