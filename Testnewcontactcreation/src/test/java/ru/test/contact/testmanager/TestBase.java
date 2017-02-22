package ru.test.contact.testmanager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.test.contact.app.ApplicationManager;

/**
 * Created by Михаил on 21.02.2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.Init();
    }

    @AfterMethod
    public void tearDown() {
        app.Stop();
    }

}
