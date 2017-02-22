package ru.test.contact.testmanager;


import org.testng.annotations.Test;


public class Testcontact extends TestBase {

    @Test
    public void Testcontact() {

        app.getGroupHelper().Fillingfirstname("Mikle");
        app.getGroupHelper().fillingmidlename("Pov");
        app.getGroupHelper().Fillingname("Intel");
        app.getGroupHelper().Fillingadress("Israel");
        app.getGroupHelper().Fillinghome("00000000");
        app.getGroupHelper().fillingname("mmmm@gmail.com");
        app.getGroupHelper().Finalstep();
    }

}
