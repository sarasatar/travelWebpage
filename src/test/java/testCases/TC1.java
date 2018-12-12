package testCases;
import cheaptickets.com.gui.flight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;



/**
 * @Author: gicastano
 * @Description;
 */
public class TC1 {

    private WebDriver driver;
    private String baseUrl;

    //prepared environment
    @BeforeTest
    public void setUp() throws Exception {

        System.setProperty("webdriver.gecko.driver", "/Users/gicastano/IdeaProjects/test_demo/chromedriver");

        //driver.manage().deleteAllCookies();
        driver = new ChromeDriver();
        baseUrl= "https://www.cheaptickets.com/";

    }

    @Test
    public void setFlightTab() {

        driver.get(baseUrl);
        flight.clickOnFlightTab(driver);
        flight.clickOnRoundTripTab(driver);
        flight.getDepartureField(driver).sendKeys("Medellin, Colombia (MDE-Jose Maria Cordova Intl.)");
        flight.getDestinationField(driver).sendKeys("Miami, FL (MIA-Miami Intl.)");
        flight.getDepartingCalendar(driver).sendKeys("12/31/2018");
        //flight.getDepartingCalendar(driver).clear();
        //flight.getReturningCalendar(driver).sendKeys("01/12/2019");

        WebElement adultDropdown = flight.getAdultDropdown(driver);
        Select adults = new Select(adultDropdown);
        adults.selectByValue("2");

        flight.clickOnSearchButton(driver);

        WebElement messageFind= driver.findElement(By.xpath("html/body/div[2]/header/h1/div/span[1]"));
        String message = messageFind.getText();
        String expectedMessage = "Select your departure to Miami";

        assertEquals(message,expectedMessage);
    }

}
