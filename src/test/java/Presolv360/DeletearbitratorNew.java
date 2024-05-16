package Presolv360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DeletearbitratorNew {
    @Test
    public void deletearbitrator() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[3]/a")).click();
        Thread.sleep(3000);
//         below code is for delete the latest arbitrator
//        driver.findElement(By.xpath("//*[@id=\"arbitrator_newreg\"]/tbody/tr[1]/td[8]/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[4]/div/div[10]/button[1]")).click();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"arbitrator_newreg\"]/tbody/tr[1]/td[8]/a")).click();
        Thread.sleep(3000);
        // this is for the first name
//        driver.findElement(By.xpath("//*[@id=\"smkform\"]/div[2]/div[1]/div/input")).sendKeys("21333");
        driver.findElement(By.name("ad1")).sendKeys("colaba mumbai");
        driver.findElement(By.name("ad2")).sendKeys("colaba mumbai");
        driver.findElement(By.name("city")).sendKeys("MU");
        driver.findElement(By.name("pincode")).sendKeys("400605");
        driver.findElement(By.name("state")).sendKeys("MH");
        driver.findElement(By.name("state")).sendKeys(Keys.BACK_SPACE);

        driver.findElement(By.name("country")).sendKeys("India");
        driver.findElement(By.name("mnumber")).sendKeys("321456");
        driver.findElement(By.name("experience")).sendKeys("kasnflslfk");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/button")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[10]/button[1]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"addnew \"]/span/i")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"addnew \"]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/ul/li[3]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"closed\"]/tbody/tr[1]/td[2]/a")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector(".btn.btn-warning.trkbtn")).click();



    }
}