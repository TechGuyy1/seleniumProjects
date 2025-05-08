package org.abcdPorject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class FirstSeleniumTest01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://techguyy1.github.io/techguys/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.getTitle().equalsIgnoreCase("Home - TechGuys");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
