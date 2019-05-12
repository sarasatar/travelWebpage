package cheaptickets.com.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {

    public WebDriver driver;
    public String baseUrl;
    public void setUp() throws Exception {

        try {
            System.setProperty("webdriver.gecko.driver", "/Users/gicastano/IdeaProjects/test_demo/chromedriver");
            driver = new ChromeDriver();
            baseUrl= "https://www.cheaptickets.com/";
        }
        catch(Exception e) {
            System.out.println("Something went wrong when starting the gecko driver");
        }


    }

}
