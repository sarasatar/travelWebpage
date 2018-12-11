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

        driver = new ChromeDriver();
        baseUrl= "https://www.cheaptickets.com/";

    }

    //Step 1: click on flight tab
    @Test
    public void setFlightTab() {

        driver.get(baseUrl);
        flight.clickOnFlightTab(driver);

    }
    /*
    //Step 2: click on round trip
    @Test
    public void setRoundTripTab() {
        this.roundTripTab=roundTripTab;
        roundTripTab.click();
    }

    //Step 3: Fill all required fields
    @Test
    public void setDepartureField() {
        this.departureField = departureField;
        departureField.sendKeys("Medellin, Colombia (MDE-Jose Maria Cordova Intl.)");
    }
    @Test
    public void setDestinationField() {
        this.destinationField = destinationField;
        destinationField.sendKeys("Miami, FL (MIA-Miami Intl.)");
    }
    @Test
    public void setDepartingCalendar() {
        this.departingCalendar = departingCalendar;
        departingCalendar.sendKeys("12/31/2018");
    }
    @Test
    public void setReturningCalendar() {
        this.returningCalendar = returningCalendar;
        returningCalendar.sendKeys("12/31/2018");
    }
    @Test
    public void setAdultDropdown() {
         this.adultDropdown = adultDropdown;
         Select adults = new Select(adultDropdown);
         adults.selectByIndex(2);

    }
    @Test
    public void setChildrenDropdown() {
        Select children = new Select(childrenDropdown);
        children.selectByIndex(0);
    }

     //Step 4: Click on search

    @Test
    public void setSearchButton() {
        this.searchButton = searchButton;
        searchButton.click();
    }

    //Expected Result: destination correct set

    @Test
    public void destinationConfirm(){

        WebElement messageFind= driver.findElement(By.xpath("html/body/div[2]/header/h1/div/span[1]"));
        String message = messageFind.getText();
        String expectedMessage = "Select your departure to Miami";

        assertEquals(message,expectedMessage);
    }*/

}
