package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkWithPrompt {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///E:/Marina/Tel%20Ran/QA%20Courses/Selenium/AlertsDemo.html");
        Thread.sleep(2000);
    }

    @Test
    public void simpleAlert() throws InterruptedException {
        driver.findElement(By
                .xpath("//button[contains(text(),'Simple Alert')]")).click();
        Thread.sleep(1000);
        System.out.println("Text inside the alert: " + driver.switchTo()
                .alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

    }
    @Test
    public void confirmBox() throws InterruptedException {
        driver.findElement(By
                .xpath("//button[contains(text(),'Confirm Box')]")).click();
        Thread.sleep(2000);
        System.out.println("Text inside the confirm box: " + driver.switchTo()
                .alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By
                .xpath("//button[contains(text(),'Confirm Box')]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
    }

    @Test
    public void promptBox() throws InterruptedException {
        driver.findElement(By
                .xpath("//button[contains(text(),'Prompt box')]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Ivan Ivanov");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By
                .xpath("//button[contains(text(),'Prompt box')]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Petr Petrov");
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
