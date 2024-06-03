package Incase360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class All_notice {
    public void Addnewnotice() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.incase360.com/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.name("userName")).sendKeys("admin@incase360.com");
        driver.findElement(By.name("userPassword")).sendKeys("1WbFG0Z84@");
        Thread.sleep(3000);
        WebElement e = driver.findElement(By.id("captchaanswer"));
        System.out.println("This is the value" + e.getAttribute("innerHTML"));
        Thread.sleep(1000);
        driver.findElement(By.id("captcha")).sendKeys(e.getAttribute("innerHTML"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/main/div/div/div/div/div/div/div/form/div[4]/div[2]/button")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/ul/li[1]/a")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[2]/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/input")).sendKeys("Font_001");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[2]/div[1]/div/div/button")).click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//div[@class='rs-table-cell-content']//div[@class='rs-table-cell-wrap']/a"));
        element.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/div[6]/div/div/button")).click();






    }
}
