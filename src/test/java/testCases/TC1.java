package testCases;
import cheaptickets.com.gui.flight;
import data.dataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


/**
 * @Author: gicastano
 * @Description; this test case is to validate that I can do a basic search and that the Returning date is put automatically
 */
public class TC1{

    public WebDriver driver;
    public String baseUrl;

    //prepared environment
    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "/Users/gicastano/IdeaProjects/test_demo/chromedriver");

        //driver.manage().deleteAllCookies();
        driver = new ChromeDriver();
        baseUrl = "https://www.cheaptickets.com/";
    }

    @Test

    public void setFlightTab() {
        driver.get(baseUrl);
        flight.clickOnFlightTab(driver);
        flight.clickOnRoundTripTab(driver);
        //Search for a flight from LAS to LAX, 1 adult (clicking on Flight/Roundtrip).
        flight.clickOnRoundTripTab(driver);
        flight.getDepartureField(driver).sendKeys(dataTest.departure());
        flight.getDestinationField(driver).sendKeys(dataTest.destination());
        //Dates should be at least two month in the future and MUST​ be selected using the datepicker calendar.
        flight.getDepartingDate(driver).click();













        WebElement adultDropdown = flight.getAdultDropdown(driver);
        Select adults = new Select(adultDropdown);
        adults.selectByValue(dataTest.adults());

        flight.clickOnSearchButton(driver);

        WebElement messageFind= driver.findElement(By.xpath("html/body/div[2]/header/h1/div/span[1]"));
        String message = messageFind.getText();
        String expectedMessage = dataTest.expectedMessage1();

        assertEquals(message,expectedMessage);
    }


    @AfterTest
    public void closeDriver(){
        driver.get(baseUrl);
        driver.quit();
    }


}
