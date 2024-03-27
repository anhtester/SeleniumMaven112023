package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownTinh extends BaseTest {
    public static void main(String[] args) {

        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        sleep(1);
        select.selectByVisibleText("Wednesday");
        sleep(1);
        select.selectByIndex(3);
        sleep(1);
        select.selectByValue("Thursday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);

        List<WebElement> listOptions = driver.findElements(By.xpath("//select[@id='select-demo']/option"));

        //select.getAllSelectedOptions();

        for (int i = 0; i < listOptions.size(); i++) {
            System.out.println(listOptions.get(i).getText());
        }

        System.out.println("=====================================");
        //Lấy theo vị trí từ cái option tứ hai
        for (int i = 1; i < listOptions.size(); i++) {
            System.out.println(listOptions.get(i).getText());
        }

        closeDriver();

    }
}
