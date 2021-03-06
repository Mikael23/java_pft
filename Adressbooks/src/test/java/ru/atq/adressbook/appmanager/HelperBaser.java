package ru.atq.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Михаил on 27.02.2017.
 */
public class HelperBaser {
    protected WebDriver wd;

    public HelperBaser(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {


        wd.findElement(locator).click();



    }

    protected void type(By locator, String text) {


             if(text!=null){
                 wd.findElement(locator).clear();
                 wd.findElement(locator).sendKeys(text);
             }




    }
    public  boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
