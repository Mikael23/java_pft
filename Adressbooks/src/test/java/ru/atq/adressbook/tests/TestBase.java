package ru.atq.adressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.atq.adressbook.appmanager.ApplicationManager;

/**
 * Created by Михаил on 27.02.2017.
 */
public class TestBase {

    public static final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeSuite
    public void setUp() throws Exception {
        app.Init();
    }

    @AfterSuite
    public void tearDown() {
        app.Stop();
    }


}
