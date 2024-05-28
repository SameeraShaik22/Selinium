package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver1=new ChromeDriver();
        WebDriver driver=new EdgeDriver();
        testing(driver);
        testing(driver1);

}
public static void  testing(WebDriver driver){

    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        <input type="text" placeholder="Username" id="inputUsername" value="">
    driver.findElement(By.id("inputUsername")).sendKeys("Adil");
    driver.findElement(By.name("inputPassword")).sendKeys("Adil");
//        <button class="submit signInBtn" type="submit">Sign In</button>
    driver.findElement(By.className("signInBtn")).click();
    // Thread.sleep(5000);

    driver.findElement(By.xpath("//p[@class='error']")).getText();
    System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());

    //Test for Forgot your password
    driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
    //Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Adil");
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Adil");
    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
    driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();


    System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());

    String messg=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
    messg =messg .substring(messg.indexOf("'") + 1);
    messg= messg.substring(0, messg.indexOf("'"));


    driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
    //Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Adil");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(messg);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
    driver.findElement(By.xpath("//input[@placeholder='Enter your Login name']")).click();



}

}
////input[@placeholder='Enter your Login name']