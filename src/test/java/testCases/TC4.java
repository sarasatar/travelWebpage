package testCases;
import cheaptickets.com.gui.hotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @Author: gicastano
 * @Description; this test case is to validate that I can do a simple hotel search
 */
public class TC4 {

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
        hotel.clickOnHotelTab(driver);
        hotel.getGoingToField(driver).sendKeys("Amazonas, Colombia");
        hotel.getCheckInCalendar(driver).sendKeys("01/03/2019");

        WebElement roomsDropdown = hotel.getRoomsDropdown(driver);
        Select room = new Select(roomsDropdown);
        room.selectByVisibleText("1");

        WebElement adultsDropdown = hotel.getRoomsDropdown(driver);
        Select adults = new Select(adultsDropdown);
        adults.selectByVisibleText("2");

        hotel.clickOnSearchButton(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement messageFind= driver.findElement(By.xpath("/html/body/div[4]/form/div[3]/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/button"));
        String message = messageFind.getText();
        String expectedMessage = "Amazonas, Colombia";

        assertEquals(message,expectedMessage);
    }


    @AfterTest
    public void closeDriver(){
        driver.get(baseUrl);
        driver.quit();
    }

}
