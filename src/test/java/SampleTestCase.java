import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SampleTestCase {
    Helper helper;
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        helper=new Helper();
        helper.setUpDriver("chrome");
    }

    @Test
    public void assertGoogleTitle() {
        String expectedTitle = "Google";
        driver = helper.driver;
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title Not Matching");
    }

    @Test
    public void assertFacebookTitle() {
        String expectedTitle = "Facebook";
        driver = helper.driver;
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title Not Matching");
    }

    @AfterClass
    public void tearDown(){
        helper.tearDown();
    }
}
