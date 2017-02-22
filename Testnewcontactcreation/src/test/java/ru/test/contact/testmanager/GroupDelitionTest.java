package ru.test.contact.testmanager;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupDelitionTest extends TestBase {

    
    @Test
    public void testGroupDelitionTest() {



        app.getGroupHelper().wd.findElement(By.xpath("//div[@id='content']/form/input[6]")).click();
        GoToGroupPage();
        SelectGroup();
        if (!app.getGroupHelper().wd.findElement(By.name("selected[]")).isSelected()) {
            app.getGroupHelper().wd.findElement(By.name("selected[]")).click();
        }
        app.getGroupHelper().wd.findElement(By.name("edit")).click();
        app.getGroupHelper().wd.navigate().back();
        DeleteGroup();
        ReturnToGroupPage();
    }

    public void ReturnToGroupPage() {
        app.getGroupHelper().wd.findElement(By.linkText("group page")).click();
    }

    public void DeleteGroup() {
        app.getGroupHelper().wd.findElement(By.name("delete")).click();
    }

    public void SelectGroup() {
        app.getGroupHelper().wd.findElement(By.xpath("//div[@id='content']//form[normalize-space(.)='test1']")).click();
    }

    public void GoToGroupPage() {
        app.getGroupHelper().wd.findElement(By.linkText("groups")).click();
    }


}

