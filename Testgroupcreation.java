package ru.atq.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.atq.adressbook.model.GroupData;

import java.util.Set;

public class Testgroupcreation extends TestBase {

    @Test
    public void testgroupcreation() {

        app.GoTo().GroupPage();
        Set<GroupData> before = app.getGroupHelper().all();

        //app.getGroupHelper().InigroupCreation();
        GroupData group = new GroupData().withName("test2");
        app.getGroupHelper().create(group);
        //app.getGroupHelper().FillGroupName(new GroupData("test1", null, null));
        //app.getGroupHelper().SubmutGroupCreation();
        //app.getGroupHelper().Returntogrouppage();
        //int after = app.getGroupHelper().getGroupCount();
        Set<GroupData> after = app.getGroupHelper().all();
        Assert.assertEquals(after.size(), before.size()+1);

        group.withID(after.stream().mapToInt((g) ->g.getID()).max().getAsInt());
        before.add(group);


        Assert.assertEquals(before,after);









    }

}
