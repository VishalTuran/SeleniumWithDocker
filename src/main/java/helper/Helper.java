package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Helper {
//    public WebDriver driver;
//    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public  WebDriver driver;
    public static String remote_url = "http://192.168.99.100:4546/wd/hub";

    public void setUpDriver(String browserName) throws MalformedURLException {
        int driverVersion=89;
        String dir=System.getProperty("user.dir");
        String pathToDriver=dir+"\\src\\main\\java\\helper\\chromedriver_"+driverVersion+".exe";
        System.setProperty("webdriver.chrome.driver",pathToDriver);
        ChromeOptions options = new ChromeOptions();
        if(browserName.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
//            driver.set(new RemoteWebDriver(new URL(remote_url), options));
        }
    }

    public void tearDown(){
        if(driver!=null)
            driver.quit();
        else
            return;
    }


}
