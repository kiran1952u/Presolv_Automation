package Presolv360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addarbitrator {

    @Test
    public void loginpage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/span")).click();
        driver.findElement(By.xpath("//*[@id=\"resolve \"]/ul/li/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tabs-2-tab-1\"]/section/div/section[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"select2-blkaction-container\"]")).click();
        Thread.sleep(2000);
        WebElement spanElement = driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/section/div/section[2]/div/div[1]/div[2]/div[1]/div/div[1]/span[1]"));

        // Perform actions on the span element
        spanElement.click();
        Thread.sleep(3000);

    }

    @Test(dataProvider = "userData")
    public void CreateArbitratorNew (String name , String last_name , String email ,String mobileNo, String random_id ) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://testing.presolv360.com/superaccess");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("superadmin@presolv360.com");
        driver.findElement(By.name("password")).sendKeys("{'%E/vR}$trong21");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/span/span")).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/ul/li[3]/a")).click();
        driver.findElement(By.name("name")).sendKeys(name);
        Thread.sleep(2000);
        driver.findElement(By.name("last_name")).sendKeys(last_name);
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.name("mobileNo")).sendKeys(mobileNo);
        Thread.sleep(2000);
        driver.findElement(By.name("random_id")).sendKeys(random_id);
        driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/div[2]/form/button")).click();
        Thread.sleep(3000);
        driver.quit();

    }

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]  {
                {"Ava Rodriguez", "developer", "ava.rodriguez@example.com", "9876543393", "pass1234"},
                {"Logan Martinez", "developer", "logan.martinez@example.com", "9876543394", "securepass"},
                {"Charlotte Lewis", "designer", "charlotte.lewis@example.com", "9876543395", "design123"},
                {"Mia Perez", "designer", "mia.perez@example.com", "9876543396", "graphic1"},
                {"Benjamin Harris", "designer", "benjamin.harris@example.com", "9876543397", "password456"},
                {"Emma Thompson", "designer", "emma.thompson@example.com", "9876543398", "webdesign123"},
                {"William Nelson", "designer", "william.nelson@example.com", "9876543399", "uiux123"}


        };
    }
}