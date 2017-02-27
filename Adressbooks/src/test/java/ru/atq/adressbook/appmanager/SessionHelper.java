package ru.atq.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Михаил on 27.02.2017.
 */
public class SessionHelper extends HelperBaser {


    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        wd.findElement(By.xpath("//div[@id='header']/a/img")).click();
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);

        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }
}
