package ru.atq.adressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GrouoDelitionTest extends TestBase {


    @Test
    public void testGrouoDelitionTest() {

        app.getNavigationHelper().GoToGroupPage();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().Returntogrouppage();
    }





    @AfterMethod
    public void tearDown() {
        app.Stop();
    }




}
