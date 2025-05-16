package org.abcdPorject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScrollDemoUsingJsExecutor {

    public static void scrollUp(WebDriver driver){
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,-1500);");
    }
//Taking screre
    public  void takeScreenShot(WebDriver driver,  String sc){
        TakesScreenshot tc =(TakesScreenshot)driver;
        //Store screenshot into screen variable of type file
        File screen= tc.getScreenshotAs(OutputType.FILE);
        //Create file path where you waant to store
       String filePath= System.getProperty("user.dir")+"/target/"+sc+".png";
       File destPath=new File(filePath);
        try {
            FileHandler.copy(screen,destPath);
            System.out.println("Screenshotsave successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver=new ChromeDriver(options);
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
        js.executeScript("window.scrollBy(2000,0);"); //x- horizantal scroll
      ScrollDemoUsingJsExecutor obj= new ScrollDemoUsingJsExecutor();
//      obj.scrollUp(driver);
        scrollUp(driver);
        String sc="Sc001";
        obj.takeScreenShot(driver,sc );
    }
}
