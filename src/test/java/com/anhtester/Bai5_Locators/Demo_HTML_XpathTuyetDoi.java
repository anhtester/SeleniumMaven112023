package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_HTML_XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        //Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        //Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456");

        //Thread.sleep(1000);
        driver.findElement(By.id("remember")).click();

        //Thread.sleep(1000);
//        driver.findElement(By.partialLinkText("Forgot")).click();

        //Khai báo cú pháp tìm kiếm, chưa có hiệu lực
//        By inputPassword = By.name("password");
//        driver.findElement(inputPassword).sendKeys("123456");

        //driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("btn")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/a[1]")).click();

        //Thread.sleep(2000);
        driver.quit();
    }
}
