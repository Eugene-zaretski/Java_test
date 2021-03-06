package ru.stqa.pft.ad;// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class A1TestTest {
    FirefoxDriver wd;


    @BeforeMethod
    public void setUp() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    @Test
    public void a1test() {
        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.cssSelector("input:nth-child(7)")).click();
        wd.findElement(By.linkText("GROUPS")).click();
        wd.findElement(By.name("new")).click();
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).sendKeys("a1");
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).sendKeys("a2");
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).sendKeys("a3");
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("group page")).click();
        wd.findElement(By.linkText("LOGOUT")).click();
    }
}

