package org.example;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Unit test for simple App.
 */
public class AppTest
{
//  WebDriver driver =new InternetExplorerDriver();
//  JavascriptExecutor js=(JavascriptExecutor) driver;
    @Test(priority=0)
    public void setup()
    {
        System.out.println("driver is set up properly");
    }
    @Test(priority=2)
    public void login()
    {
        System.out.println("login is successful");
    }
    @Test
    public void test1()
    {
        System.out.println("test1 is executed");
    }
    @Test
    public void test2()
    {
        System.out.println("test2 is executed");
    }
    @Test
    public void teardown()
    {
        System.out.println("driver is closed successfully");
    }

}
