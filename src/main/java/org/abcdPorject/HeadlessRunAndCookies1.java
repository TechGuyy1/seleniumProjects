package org.abcdPorject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class HeadlessRunAndCookies1 extends ScrollDemoUsingJsExecutor{
    WebDriver driver;
    public void openDriver(String browserName){
        //Headless run & clearing cookies
        //ChromeOptions  options= new ChromeOptions();
        //options.addArguments("--headless");
       if(browserName.equalsIgnoreCase("Chrome")){
           WebDriver driver =new ChromeDriver();
           this.driver=driver;
       } else if (browserName.equalsIgnoreCase("Edge")) {
           WebDriver driver=new EdgeDriver();
           this.driver=driver;
       } else if (browserName.equalsIgnoreCase("FireFox")) {
           WebDriver driver = new FirefoxDriver();
           this.driver=driver;
       }
        //this is used assign the current instance of class
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    public void navigateToURL(String url){
        driver.get(url);
    }

    public static void main(String[] args) {
        HeadlessRunAndCookies1 obj= new HeadlessRunAndCookies1();
        obj.openDriver("Chrome");
        obj.navigateToURL("https://jqueryui.com/draggable/");
        //inherited other class method
        obj.takeScreenShot(obj.driver,"Screen002May19" );
        obj.driver.findElement(By.xpath("//a[contains(text(),'Dropp')]")).click();
        //Switching to i frames
        obj.driver.switchTo().frame(0);




    }
}
