package ru.atq.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Михаил on 27.02.2017.
 */
public class NavigationHelper extends HelperBaser {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void GroupPage() {
        click(By.linkText("groups"));
        }




        public void GoToHomePage(){
        click(By.linkText("home"));
        }
    }

