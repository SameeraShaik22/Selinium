package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
