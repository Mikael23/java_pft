package ru.atq.adressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ru.atq.adressbook.model.GroupData;

public class GrouoDelitionTest extends TestBase {


    @Test
    public void testGrouoDelitionTest() {

        app.getNavigationHelper().GoToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().Returntogrouppage();
    }




    @AfterMethod
    public void tearDown() {
        app.Stop();
    }




}
