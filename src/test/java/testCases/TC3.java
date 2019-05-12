package testCases;
import cheaptickets.com.gui.flight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @Author: gicastano
 * @Description; this test case is to validate that I can do a advanced search
 */
public class TC3 {

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
        flight.getDepartingCalendar(driver).sendKeys("12/31/2018");

        WebElement adultDropdown = flight.getAdultDropdown(driver);
        Select adults = new Select(adultDropdown);
        adults.selectByVisibleText("2");

        flight.getAdvancedOptionsDropdown(driver);
        flight.setNonStopCheckbox(driver);
        WebElement  preferredAirlineDropdown = flight.getPreferredAirlineDropdown(driver);
        Select preferredAirline = new Select(preferredAirlineDropdown);
        preferredAirline.selectByValue("AV");

        flight.clickOnSearchButton(driver);


        WebElement messageFind= driver.findElement(By.xpath("html/body/div[2]/header/h1/div/span[1]"));
        String message = messageFind.getText();
        String expectedMessage = "Select your departure to Miami";

        assertEquals(message,expectedMessage);
    }



    @AfterTest
    public void closeDriver(){
        driver.get(baseUrl);
        driver.quit();
    }

}
