package ru.atq.adressbook.tests;

import org.testng.annotations.Test;
import ru.atq.adressbook.model.GroupData;

/**
 * Created by Михаил on 27.02.2017.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().GoToGroupPage();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().FillGroupName(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().Returntogrouppage();
    }

}
