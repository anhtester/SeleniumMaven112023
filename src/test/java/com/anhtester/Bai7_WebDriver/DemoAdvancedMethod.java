package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoAdvancedMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ví dụ thiết lập 10 giây cho tất cả tìm kiếm trên mỗi element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        // Navigate to a page
        driver.navigate().to("https://crm.anhtester.com/admin/authentication");

        //Add cookie
        Cookie cookie = new Cookie("sp_session", "d37ff0c6247cf368c98c9ef96e30a46ca03ff0dd");
        driver.manage().addCookie(cookie);
        Thread.sleep(1000);
        driver.navigate().refresh();
        System.out.println(driver.manage().getCookieNamed("sp_session").getValue());
        Thread.sleep(3000);
        driver.quit();
    }
}
