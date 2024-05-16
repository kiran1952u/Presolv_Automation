package Incase360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Incase360login {

    @Test
    public void loginpage() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://192.168.2.105:3001/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).sendKeys("kiran@presolv360.com");
        driver.findElement(By.id("userPassword")).sendKeys("1952");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/main/div/div/div/div/div/div/div/form/div[3]/div[2]/button")).click();
//        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"webpack-dev-server-client-overlay-div\"]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div/div/div/ul/li[3]/a")).click();






    }
}
