import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
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
    public void assertTitle(){
        String expectedTitle="Google";
        driver=helper.driver.get();
        driver.get("https://www.google.com");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Title Not Matching");
}

    @AfterClass
    public void tearDown(){
        helper.tearDown();
    }
}
