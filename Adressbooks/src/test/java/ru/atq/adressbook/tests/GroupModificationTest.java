package ru.atq.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.atq.adressbook.model.GroupData;

import java.util.Set;

/**
 * Created by Михаил on 27.02.2017.
 */
public class GroupModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.GoTo().GroupPage();
        if(app.getGroupHelper().list().size()==0){
            app.getGroupHelper().create(new GroupData().withName("test1"));
        }

    }





    @Test
    public void testGroupModification(){

        Set<GroupData> before = app.getGroupHelper().all();
        GroupData modifiedGroup = before.iterator().next();

        GroupData group = new GroupData().withID(modifiedGroup.getID()).withName("test1").
                withHeader("test2").withFooter("test3");

        app.getGroupHelper().modify(group);
        Set <GroupData> after = app.getGroupHelper().all();

        Assert.assertEquals(after.size(), before.size());
        before.remove(modifiedGroup);
        before.add(group);

        Assert.assertEquals(before,after);


    }



}
