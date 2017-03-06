package ru.atq.adressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.atq.adressbook.model.GroupData;

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

    public void SelectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {

        InigroupCreation();
        FillGroupName(group);
        SubmutGroupCreation();
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
}


