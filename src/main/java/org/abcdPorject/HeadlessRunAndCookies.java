package org.abcdPorject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessRunAndCookies extends ScrollDemoUsingJsExecutor {
    WebDriver driver;
    public WebDriver openBrowser() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--headless");
        WebDriver driver = new ChromeDriver(opt);
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();//Clearing the catche
        return driver;
    }
    public void navigateToURL(String url) {
        driver.get(url);

    }
    public static void main(String[] args) {
        HeadlessRunAndCookies obj = new HeadlessRunAndCookies();
        obj.openBrowser();
        obj.navigateToURL("https://jqueryui.com/draggable/");
        obj.takeScreenShot(obj.driver, "TestCS02");
    }

}
