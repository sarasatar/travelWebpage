package testCases;
import cheaptickets.com.gui.flight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


/**
 * @Author: gicastano
 * @Description; Negative Test - this test case is to validate that I can't set date in different format that MM/DD/YYYY
 */
public class TC2 {

    private WebDriver driver;
    private String baseUrl;

    //prepared environment
    @BeforeTest
    public void setUp() throws Exception {

        try {
            System.setProperty("webdriver.gecko.driver", "/Users/gicastano/IdeaProjects/test_demo/chromedriver");

            //driver.manage().deleteAllCookies();
            driver = new ChromeDriver();
            baseUrl = "https://www.cheaptickets.com/";
        }
        catch (exception e){
            String f = "Something went wrong starting chromedriver";
            System.out.println(f);
        }

    }

    @Test
    public void setFlightTab() {

        driver.get(baseUrl);
        flight.clickOnFlightTab(driver);
        flight.clickOnRoundTripTab(driver);
        flight.getDepartureField(driver).sendKeys("Medellin, Colombia (MDE-Jose Maria Cordova Intl.)");
        flight.getDestinationField(driver).sendKeys("Miami, FL (MIA-Miami Intl.)");
        flight.getDepartingCalendar(driver).sendKeys("13/01/2018");
        

        flight.clickOnSearchButton(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement messageFind= driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[2]/div/ul/li[1]/a"));
        String message = messageFind.getText();
        String expectedMessage = "Date format should be MM/dd/yyyy.";

        assertEquals(message,expectedMessage);
    }

    @AfterTest
    public void closeDriver(){
        driver.get(baseUrl);
        driver.quit();
    }
}
