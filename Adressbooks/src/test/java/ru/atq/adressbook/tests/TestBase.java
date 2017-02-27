package ru.atq.adressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.atq.adressbook.appmanager.ApplicationManager;

/**
 * Created by Михаил on 27.02.2017.
 */
public class TestBase {

    public final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeMethod
    public void setUp() throws Exception {
        app.Init();
    }

    @AfterMethod
    public void tearDown() {
        app.Stop();
    }


}
