package MySel20Proj.MySel20Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver() ;
        driver.get("http://devmerchantspanel.multisafepay.com");
        driver.findElement(By.name("username")).sendKeys("tys@webcashier.com");
        driver.findElement(By.name("security_code")).sendKeys("111111");
        driver.findElement(By.name("password")).sendKeys("pas123");
        driver.findElement(By.className("btn btn-primary btn-lg btn-block")).click();
    }
}
