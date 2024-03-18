package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class DemoPerfexCRM_6MethodsGET {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        String headerLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println(headerLogin);
        Thread.sleep(1000);
        String tagNameHTML = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getTagName();
        System.out.println(tagNameHTML);

        String backgroundColor = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("background-color");
        String color = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("color");
        String font_size = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("font-size");
        String font_weight = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("font-weight");

        System.out.println(backgroundColor);
        System.out.println(color);
        System.out.println(font_size);
        System.out.println(font_weight);

        //Get Size of Login button
        Dimension dimension = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getSize();
        System.out.println("Height: " + dimension.getHeight());
        System.out.println("Width: " + dimension.getWidth());

        //Get Location of Login button
        Point point = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getLocation();
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Login']")).getAccessibleName());
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Login']")).getAriaRole());

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='password']")).submit();
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("CMC Global");
        driver.findElement(By.xpath("(//a[normalize-space()='CMC Global'])[1]")).click();
        String companyName = driver.findElement(By.xpath("//input[@id='company']")).getAttribute("value");
        System.out.println(companyName);

        String vatNumber = driver.findElement(By.xpath("//input[@id='vat']")).getAttribute("value");
        System.out.println(vatNumber);

        Thread.sleep(2000);
        driver.quit();

    }
}
