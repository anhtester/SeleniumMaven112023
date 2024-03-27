package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        System.out.println("Checkbox 1: " + driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected());
        System.out.println("Checkbox 2: " + driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected());
        sleep(1);
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        System.out.println("Checkbox 1 AFTER: " + driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected());

        //Multi checkbox
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//div[@class='checkbox']//input"));

        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println(listCheckbox.get(i).isSelected());
        }

        closeDriver();

    }
}
