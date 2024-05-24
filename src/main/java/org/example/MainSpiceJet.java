package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainSpiceJet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown=new Select(staticDropDown);
        dropDown.selectByIndex(3);
        System.out.println(dropDown.getFirstSelectedOption().getText());
        dropDown.selectByVisibleText("AED");
        System.out.println(dropDown.getFirstSelectedOption().getText());
        dropDown.selectByValue("INR");
        System.out.println(dropDown.getFirstSelectedOption().getText());

        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(1000);


        for(int i=0;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

        //a[@value='DED']
        //a[@value='HYD']
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
    }
}
