package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.net.MalformedURLException;

public class Helper {
    public  WebDriver driver;

    public static String detectOS(){
        String OS=System.getProperty("os.name").toLowerCase();
        if(OS.contains("win")) {
            return "Window";
        }
        return "linux";
    }

    public void setUpDriver(String browserName) throws MalformedURLException {
        String dir=System.getProperty("user.dir");
        String pathToDriver;
        if(detectOS().equalsIgnoreCase("Window")){
            pathToDriver=dir+ File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"helper"+File.separator+"chromedriver_win.exe";
        }else{
            pathToDriver=dir+ File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"helper"+File.separator+"chromedriver_linux";
        }
        System.setProperty("webdriver.chrome.driver",pathToDriver);
        driver=new ChromeDriver();
    }

    public void tearDown(){
        if(driver!=null)
            driver.quit();
        else
            return;
    }
}
