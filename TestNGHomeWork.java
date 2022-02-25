package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGHomeWork {
    WebDriver driver;
   @Test(priority = 1)
    void openBrowser(){
        System.out.println("open the browser");
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://demo.nopcommerce.com/");
       driver.manage().window().maximize();
    }
    @Test(priority = 2)
    void findProduct(){
        System.out.println("find the product");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
    }
    @Test(priority = 3)
    void addProduct(){
       System.out.println("select the product");
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }@Test(priority = 4)
     void buyProduct(){
        System.out.println("buy the product");
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.id("updatecart")).click();
       // driver.findElement(By.xpath("//*[@id=\"itemquantity11225\"]")).click();
    }
    @Test(priority = 5)
    void checkout(){
        System.out.println("ready for checkout");
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
   }
}
