package org.abcdPorject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstSeleniumTest {
    public static void main(String[] args) {
        //Launching web driver and navigating to the website/url
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://in.linkedin.com/?mcid=6844056167778418689&src=go-pa&trk=sem-ga_campid.14650114788_asid.151761418307_crid.657403558715_kw.linkedin%20login_d.c_tid.kwd-12704335873_n.g_mt.e_geo.9062083&cid=&gad_source=1&gbraid=0AAAAABKX7wHNKtN88gRByU7RtH8vOHchU&gclid=Cj0KCQjwt8zABhDKARIsAHXuD7apV4bO3EOeZmCTJQCP8MD7LvFqpWSsA03UGusqWdCiSKh5zND2zVUaAuDjEALw_wcB&gclsrc=aw.ds");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".nav__button-secondary.btn-secondary-emphasis.btn-md")).click();
        // driver.findElement(By.xpath("//a[@class='nav__button-secondary btn-secondary-emphasis btn-md']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramchvan");
        //driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
        driver.manage().deleteAllCookies();
    }
}
