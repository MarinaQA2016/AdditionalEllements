package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkWithWindows {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/default.asp");
        Thread.sleep(15000);
    }

    @Test
    public void windowsHandling() throws InterruptedException {
        System.out.println("Current window: " + driver.getWindowHandle());
        driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself »')]")).click();
        Thread.sleep(15000);
        //System.out.println("Button Run: " + driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).getText());
        System.out.println("Example element: " + driver.findElement(By.xpath(" //h3[contains(text(),'Example')]")).getText());
        System.out.println("Current window: " + driver.getWindowHandle());
        String firstWindow = driver.getWindowHandle();
        String secondWindow = "";
        for(String uId: driver.getWindowHandles()){
            System.out.println("Window from list: " + uId);
            if(!uId.equals(firstWindow)) secondWindow = uId;
        }
        driver.switchTo().window(secondWindow);
        System.out.println("Button Run: " + driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).getText());
        driver.close();
        driver.switchTo().window(firstWindow);
        System.out.println("Example element: " + driver.findElement(By.xpath(" //h3[contains(text(),'Example')]")).getText());


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
