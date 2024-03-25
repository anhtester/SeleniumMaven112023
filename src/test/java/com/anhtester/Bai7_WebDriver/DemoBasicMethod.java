package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DemoBasicMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        // Ví dụ thiết lập 10 giây cho tất cả tìm kiếm trên mỗi element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        Thread.sleep(1000);
        // Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
        Thread.sleep(1000);
        // Làm mới trang hiện tại
        driver.navigate().refresh();
        Thread.sleep(1000);
        // Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        Thread.sleep(1000);
        // Get the title of the page
        String title = driver.getTitle();
        // Get the current URL
        String url = driver.getCurrentUrl();
        // Get the current page HTML source
        String html = driver.getPageSource();

        System.out.println(title);
        System.out.println(url);
        System.out.println(html);

        System.out.println(html.contains("Kiến thức Tester"));

        driver.quit();
    }
}
