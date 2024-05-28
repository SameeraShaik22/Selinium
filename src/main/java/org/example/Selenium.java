//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//
//public class Selenium {
////    public static void main(String[] args) {
////        WebDriver driver=new ChromeDriver();
////        driver.get("https://rahulshettyacademy.com/locatorspractice/");
////        driver.findElement(By.id("inputUsername")).sendKeys("Adil");
////        driver.findElement(By.name("inputPassword")).sendKeys("Sameera");
////        driver.findElement(By.xpath("//button[@type='submit']")).click();
////    }
//
//    public static void main(String[] args) {
//        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("https://www.wylietexas.gov/");
//
//
//        driver.findElement(By.xpath("//a[normalize-space()='Departments']//i[@class='fa fa-angle-down down-arrow']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Parks']")).click();
//        driver.findElement(By.xpath("//a[@class='menuA level0 menuSelectedChild first']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='1312 East Brown Street']")).click();
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(0));
//        System.out.println("Page title of new tab: " + driver.getTitle());
//        ////a[@class='menuA level0 menuSelectedChild'][normalize-space()='Pavilions'] //img[@alt='Reserve Now Button']
//        driver.findElement(By.xpath("//a[@class='menuA level0 menuSelectedChild'][normalize-space()='Pavilions']")).click();
//        driver.findElement(By.xpath("//img[@alt='Reserve Now Button']")).click();
//
////        driver.findElement(By.xpath("//a[@class='menuA level0 menuSelectedChild'][normalize-space()='Pavilions']")).click();
////        driver.findElement(By.xpath("//img[@alt='Reserve Now Button']")).click();
////git branch -M main
////        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
////        //switch to new tab
////        driver.switchTo().window(newTb.get(1));
////        System.out.println("Page title of new tab: " + driver.getTitle());
////
////        driver.findElement(By.xpath("//span[normalize-space()='Founders Park Softball C']")).click();
////        driver.findElement(By.xpath("//a[normalize-space()='Sign in now']")).click();
////        WebElement email = driver.findElement(By.id("email"));
////        WebElement password = driver.findElement(By.id("password"));
////        WebElement loginButton = driver.findElement(By.id("login-button"));
////        email.clear();
////        System.out.println("entering the email");
////        email.sendKeys("sameera.shaik22@gmail.com");
////        password.clear();
////        System.out.println("entering the password");
////        password.sendKeys("Sameera1234@");
////        loginButton.click();
//
//
//    }
//}
//////a[normalize-space()='Sign in now']  //a[normalize-space()='Sign in now']id attribute is not available for this element