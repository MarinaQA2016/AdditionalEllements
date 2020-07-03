package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkWithFrame {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        Thread.sleep(20000);
    }

    @Test
    public void testFrames(){
        //System.out.println("Text in header:" + driver.findElement(By.xpath("//h1")).getText());
        System.out.println("Button Run outside frames:" + driver.findElement(By.xpath("//button[contains(text(),'Run')]")).getText());

        //-----------Switch to frame1 ---------
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        System.out.println("Text in header h2:" + driver.findElement(By.xpath("//h2")).getText());

        //-----------Switch to default content---------
        driver.switchTo().parentFrame();
        System.out.println("Button Run outside frames:" + driver.findElement(By.xpath("//button[contains(text(),'Run')]")).getText());

        //-----------Switch to frame1 -------------
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

        //-----------Switch to frame2 (inside frame1)---------
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title = 'Iframe Example']")));
        System.out.println("Text in header h1:" + driver.findElement(By.xpath("//h1")).getText());

        //-----------Switch to default content---------
        driver.switchTo().defaultContent();
        System.out.println("Button Run outside frames:" + driver.findElement(By.xpath("//button[contains(text(),'Run')]")).getText());

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
