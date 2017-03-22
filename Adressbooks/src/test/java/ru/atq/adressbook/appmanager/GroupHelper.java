package ru.atq.adressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.atq.adressbook.model.GroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Михаил on 27.02.2017.
 */
public class GroupHelper extends HelperBaser {

    public GroupHelper(WebDriver wd)
    {
        super(wd);
    }

    public void Returntogrouppage() {
        click(By.linkText("group page"));
    }

    public void SubmutGroupCreation() {
        click(By.name("submit"));
    }

    public void FillGroupName(GroupData groupData) {
        type(By.name("group_name"),groupData.getName());
        type(By.name("group_header"),groupData.getName());
        type(By.name("group_footer"),groupData.getName());
    }


    public void InigroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void SelectGroup(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
       // click(By.name("selected[]"));
    }
    public void SelectGroupByID(int ID) {
        wd.findElement(By.cssSelector("input[value='" + ID + "']")).click();
        // click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void create(GroupData group) {

        InigroupCreation();
        FillGroupName(group);
        SubmutGroupCreation();
        Returntogrouppage();

    }

    public void modify(GroupData group) {
        SelectGroupByID(group.getID());
        initGroupModification();

        FillGroupName(group);
        submitGroupModification();
        Returntogrouppage();
    }

    public void delete(int index) {
        SelectGroup(index);
        deleteSelectedGroups();
        Returntogrouppage();
    }

    private boolean isElementpresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return false;
        }
    }

   public boolean isThereAGroup(){

        return isElementpresent(By.name("selected[]"));
    }

    public int getGroupCount() {
       return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> list() {
       List <GroupData> groups = new ArrayList<GroupData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for(WebElement element : elements){
            String name = element.getText();
            int ID = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupData().withID(ID).withName(name));
        }
       return groups;
    }

    public Set<GroupData> all() {
        Set<GroupData> groups = new HashSet<GroupData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for(WebElement element : elements){
            String name = element.getText();
            int ID = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupData().withID(ID).withName(name));
        }
        return groups;
    }
    public void delete(GroupData group) {
        SelectGroupByID(group.getID());
        deleteSelectedGroups();
        Returntogrouppage();
    }
}


