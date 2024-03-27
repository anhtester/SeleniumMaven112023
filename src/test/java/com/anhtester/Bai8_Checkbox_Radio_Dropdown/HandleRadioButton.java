package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        System.out.println("Radio Button Female: " + driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).isSelected());

        sleep(1);
        driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).click();

        System.out.println("Radio Button Female After Clicked: " + driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).isSelected());

        System.out.println("Radio Button Male After Clicked: " + driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected());

        closeDriver();

    }
}
