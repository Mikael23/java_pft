package ru.atq.adressbook.tests;

import org.testng.annotations.Test;
import ru.atq.adressbook.model.GroupData;

public class Testgroupcreation extends TestBase {

    @Test
    public void testgroupcreation() {

        app.getNavigationHelper().GoToGroupPage();
        app.getGroupHelper().InigroupCreation();
        app.getGroupHelper().FillGroupName(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().SubmutGroupCreation();
        app.getGroupHelper().Returntogrouppage();
    }

}
