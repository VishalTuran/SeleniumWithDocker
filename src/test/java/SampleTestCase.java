import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestCase {
    Helper helper;
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        helper=new Helper();
        helper.setUpDriver("chrome");
    }

    @Test
    public void assertTitle(){
        String expectedTitle="Google";
        driver=helper.driver;
        driver.get("https://www.google.com");
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Title Not Matching");
}

    @AfterClass
    public void tearDown(){
        helper.tearDown();
    }
}
