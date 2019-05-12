package testCases;
import cheaptickets.com.gui.flight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;


/**
 * @Author: gicastano
 * @Description; this test case is to validate that I can do a basic search and that the Returning date is put automatically
 */
public class TC1 {


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

        public String departure="Medellin, Colombia (MDE-Jose Maria Cordova Intl.)";

        driver.get(baseUrl);
        flight.clickOnFlightTab(driver);
        flight.clickOnRoundTripTab(driver);
        flight.getDepartureField(driver).sendKeys("departure");
        flight.getDestinationField(driver).sendKeys("Miami, FL (MIA-Miami Intl.)");
        flight.getDepartingCalendar(driver).sendKeys("12/31/2018");

        WebElement adultDropdown = flight.getAdultDropdown(driver);
        Select adults = new Select(adultDropdown);
        adults.selectByValue("2");

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
