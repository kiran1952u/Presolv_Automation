package com.org.test;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
    private static final boolean flase = false;

    @Test
    public void f() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("kiran");
        driver.findElement(By.name("lastname")).sendKeys("Nikam");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/2/2024");


    }

    @Test
    public void f1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("kiran");
        driver.findElement(By.name("lastname")).sendKeys("Nikam");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/2/2024");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[20]/input[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[22]/input[3]")).click();
        driver.findElement(By.name("continents")).click();
        Thread.sleep(3000);
        Select drpCountry = new Select(driver.findElement(By.name("continents")));
        drpCountry.selectByVisibleText("South America");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[25]/div[2]/select")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[27]/div[2]/select/option[1]")).click();
        Thread.sleep(3000);


    }

    @Test
//  Testcase 3
    public void f11() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("kiran");
        driver.findElement(By.name("lastname")).sendKeys("Nikam");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/2/2024");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[20]/input[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[22]/input[3]")).click();
        driver.findElement(By.name("continents")).click();
        Thread.sleep(3000);
        Select drpCountry = new Select(driver.findElement(By.name("continents")));
        drpCountry.selectByVisibleText("South America");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[25]/div[2]/select")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[27]/div[2]/select/option[1]")).click();
        Thread.sleep(3000);


    }

    @Test
//   Testcases 4
    public void f12() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("kiran");
        driver.findElement(By.name("lastname")).sendKeys("Nikam");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/2/2024");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[20]/input[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[22]/input[3]")).click();
        driver.findElement(By.name("continents")).click();
        Thread.sleep(3000);
        Select drpCountry = new Select(driver.findElement(By.name("continents")));
        drpCountry.selectByVisibleText("South America");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[25]/div[2]/select")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[27]/div[2]/select/option[1]")).click();
        Thread.sleep(3000);


    }
}

