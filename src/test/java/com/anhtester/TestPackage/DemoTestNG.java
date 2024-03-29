package com.anhtester.TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTestNG {

    public void testLoginCRM3(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        driver.quit();
    }

    @Test
    public void testLoginCRM(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        driver.quit();
    }

    @Test
    public void testLoginCMS(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        driver.quit();
    }
}
