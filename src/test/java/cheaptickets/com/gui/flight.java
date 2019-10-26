package cheaptickets.com.gui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


/**
 * @Author: gicastano
 * This class contains the elements of the Simple Flight search
 */

public class flight {

    public static WebElement element = null;

    @FindBy(xpath = "//*[@id=\"flight-type-one-way-label-hp-flight\"]")
    public WebElement oneWayTab;

    @FindBy(xpath = "//*[@id=\"flight-type-multi-dest-label-hp-flight\"]")
    public WebElement multiCityTab;

    @FindBy(xpath = "///*[@id=\"flexibleDate\"]")
    public WebElement flexibleDateCheckbox;

    @FindBy(xpath = "/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[6]/label[1]")
    public WebElement addHotelCheckbox;

    @FindBy(xpath = "/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[6]/label[2]")
    public WebElement addCarCheckbox;


    public static void clickOnFlightTab(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']/span"));
        element.click();
    }

    public static void clickOnRoundTripTab(WebDriver driver) {
        element = driver.findElement(By.id("tab-flight-tab-hp"));
        element.click();
    }

    public static WebElement getDepartureField(WebDriver driver) {
        element = driver.findElement(By.id("flight-origin-hp-flight"));
        return element;
    }

    public static WebElement getDestinationField(WebDriver driver) {
        element = driver.findElement((By.id("flight-destination-hp-flight")));
        return element;
    }


    public static WebElement getDepartingDate(WebDriver driver) {
        element = driver.findElement((By.cssSelector("#package-departing-hp-package")));
        return element;
    }

    public static WebElement getReturningCalendar(WebDriver driver) {
        element = driver.findElement((By.id("flight-returning-hp-flight")));
        return element;
    }

    public static void setNonStopCheckbox(WebDriver driver) {
        element = driver.findElement((By.xpath("//*[@id=\"advanced-flight-nonstop-hp-flight\"]")));
        element.click();
    }

    public static WebElement getAdultDropdown(WebDriver driver) {
        element = driver.findElement((By.id("flight-adults-hp-flight")));
        return element;
    }

    public static void getChildrenDropdown(WebDriver driver) {
        element = driver.findElement((By.xpath("//*[@id=\"flight-children-hp-flight\"]")));
        element.click();
    }

    public static void getAdvancedOptionsDropdown(WebDriver driver) {
        element = driver.findElement((By.xpath("//html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/fieldset[4]/a/span")));
        element.click();
    }

    public static void setRefundableFlightCheckbox(WebDriver driver) {
        element = driver.findElement((By.xpath("//*[@id=\"advanced-flight-refundable-label-hp-flight\"]")));
        element.click();
    }


    public static WebElement getPreferredAirlineDropdown(WebDriver driver) {
        element = driver.findElement((By.id("flight-advanced-preferred-airline-hp-flight")));
        return element;

    }

    public static void getPreferredClassDropdown(WebDriver driver) {
        element = driver.findElement((By.xpath("//*[@id=\"flight-advanced-preferred-class-hp-flight\"]")));
        element.click();
    }

    public static void clickOnSearchButton(WebDriver driver) {
        element = driver.findElement((By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[9]/label/button")));
        element.click();
    }

}
