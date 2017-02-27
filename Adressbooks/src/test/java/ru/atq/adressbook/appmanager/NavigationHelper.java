package ru.atq.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Михаил on 27.02.2017.
 */
public class NavigationHelper extends HelperBaser {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void GoToGroupPage() {
        click(By.linkText("groups"));
    }
}
