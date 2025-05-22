package org.abcdPorject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDemo {

    public static void main(String[] args) {
        WebDriver dri= new ChromeDriver();
        dri.get("https://jqueryui.com/draggable/");
        dri.manage().window().maximize();
        dri.manage().deleteAllCookies();
        dri.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
        //Using Frame index
        // dri.switchTo().frame(0);
        //Using Frame xpath/webelement
        dri.switchTo().frame(dri.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement from= dri.findElement(By.xpath("//div[@id='draggable']")); //Drag from
        WebElement to=dri.findElement(By.xpath("//div[@id='droppable']"));//Drag to
        Actions actions= new Actions(dri);
       actions.dragAndDrop(from,to).perform();
    }
}
