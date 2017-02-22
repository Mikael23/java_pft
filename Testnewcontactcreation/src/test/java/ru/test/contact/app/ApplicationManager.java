package ru.test.contact.app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Михаил on 21.02.2017.
 */
public class ApplicationManager {
    public FirefoxDriver wd;

    private  GroupHelper groupHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void Init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/edit.php");
        groupHelper = new GroupHelper(wd);
        Login("admin", "\\undefined");
    }

    public void Login(String Name, String Password) {
      wd.findElement(By.name("user")).click();
       wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(Name);
        wd.findElement(By.name("pass")).click();
       wd.findElement(By.name("pass")).sendKeys(Password);
        wd.findElement(By.name("pass")).click();
    }

    public void Stop() {
        groupHelper.wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
