package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_Xpath_TuongDoi {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
//        driver.findElement(By.id("email")).sendKeys("admin@example.com");
//        driver.findElement(By.name("password")).sendKeys("123456");
//        driver.findElement(By.id("remember")).click();
//        driver.findElement(By.className("btn")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@href='https://crm.anhtester.com/admin/clients/client'])[2]")).click();

        driver.quit();
    }
}
