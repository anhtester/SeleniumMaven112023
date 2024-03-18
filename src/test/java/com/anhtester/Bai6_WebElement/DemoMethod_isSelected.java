package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethod_isSelected {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        boolean checkCheckboxDefault = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("Check Checkbox default: " + checkCheckboxDefault);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[normalize-space()='Default Checked']")).click();
        Thread.sleep(1000);
        boolean checkCheckboxDefaultAfter = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("Check Checkbox default after: " + checkCheckboxDefaultAfter);

        Thread.sleep(1000);
        driver.quit();
    }
}
