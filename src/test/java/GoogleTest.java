import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private static WebDriver driver;


    @BeforeClass
    public static void openBrowser() {
        //   Assertions.assertEquals("","");
        System.setProperty("webdriver.chrome.driver", "d:/гк/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
//driver.close();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser() {
//driver.close();
    }
    @Test
    public void getTitle(){
Assertions.assertEquals("Google",driver.getTitle());
    }
    @Test
    public void getUrl(){
Assertions.assertEquals("https://www.google.com/?safe=active&ssui=on",
driver.getCurrentUrl());
    }
    @Test
    public void search(){
        String text="text";
WebElement input =  driver.findElement(By.xpath("//input[@title='Поиск']"));
input.sendKeys(text);
input.sendKeys(Keys.ENTER);
//проверка, что поиск состоялся
Assertions.assertTrue(driver.getCurrentUrl().contains("google.com/search"));
    }
}


