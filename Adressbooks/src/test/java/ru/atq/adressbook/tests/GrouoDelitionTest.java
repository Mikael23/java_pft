package ru.atq.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.atq.adressbook.model.GroupData;

import java.util.Set;

public class GrouoDelitionTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.GoTo().GroupPage();
        if(app.getGroupHelper().list().size()==0){
            app.getGroupHelper().create(new GroupData().withName("test1"));
        }

    }


    @Test
    public void testGrouoDelitionTest() {


        Set<GroupData> before = app.getGroupHelper().all();
        GroupData deletedGroup = before.iterator().next();

        app.getGroupHelper().delete(deletedGroup);
        Set<GroupData> after = app.getGroupHelper().all();
        Assert.assertEquals(after.size(), before.size()-1);

        before.remove(deletedGroup);

            Assert.assertEquals(before,after);
        }




    @AfterMethod
    public void tearDown() {
        app.Stop();
    }




}
