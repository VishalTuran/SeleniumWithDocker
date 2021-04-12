package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
    public WebDriver driver;

    public void setUpDriver(String browserName){
        int driverVersion=89;
        String dir=System.getProperty("user.dir");
        String pathToDriver=dir+"\\src\\main\\java\\helper\\chromedriver_"+driverVersion+".exe";
        System.setProperty("webdriver.chrome.driver",pathToDriver);
        if(browserName.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
    }

    public void tearDown(){
        if(driver!=null)
            driver.quit();
        else
            return;
    }


}
