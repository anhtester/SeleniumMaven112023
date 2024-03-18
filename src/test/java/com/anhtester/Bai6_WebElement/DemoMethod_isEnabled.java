package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethod_isEnabled {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        Thread.sleep(2000);

        boolean checkSubmitButton = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check Submit button enable: " + checkSubmitButton);

        boolean checkHackedSubmitButton = driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled();
        System.out.println("Check Hacked Submit Button enable: " + checkHackedSubmitButton);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("client@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");

        boolean checkSubmitButtonAfter = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check Submit button enable AFTER: " + checkSubmitButtonAfter);

        Thread.sleep(1000);
        driver.quit();
    }
}
