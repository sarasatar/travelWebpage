package cheaptickets.com.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * @Author: gicastano
 *  This class contains the elements of the Simple Flight search
 */

public class hotel {

    public static WebElement element = null;

    public static void clickOnHotelTab(WebDriver driver) {
        element = driver.findElement((By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/ul/li[2]/button/span[2]")));
        element.click();
    }

    public static WebElement getGoingToField(WebDriver driver) {
        element = driver.findElement((By.id("hotel-destination-hp-hotel")));
        return element;
    }

    public static WebElement getCheckInCalendar(WebDriver driver) {
        element = driver.findElement((By.id("hotel-checkin-hp-hotel")));
        return element;
    }

    public static WebElement getCheckOutCalendar(WebDriver driver) {
        element = driver.findElement((By.id("hotel-checkout-hp-hotel")));
        return element;
    }

    public static WebElement getRoomsDropdown(WebDriver driver) {
        element = driver.findElement((By.id("hotel-rooms-hp-hotel")));
        return element;
    }

    public static WebElement getAdults(WebDriver driver) {
        element = driver.findElement((By.id("hotel-1-adults-hp-hotel")));
        return element;
    }

    public static WebElement getChildren(WebDriver driver) {
        element = driver.findElement((By.id("hotel-1-children-hp-hotel")));
        return element;
    }

    public static void clickOnAddFlightCheckbox(WebDriver driver) {
        element = driver.findElement((By.id("hotel-add-flight-checkbox-hp-hotel")));
        element.click();
    }

    public static WebElement clickOnCarCheckbox(WebDriver driver) {
        element = driver.findElement((By.id("hotel-add-car-checkbox-hp-hotel")));
        return element;
    }

    public static void clickOnSearchButton(WebDriver driver) {
        element = driver.findElement((By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[2]/form/div[8]/label/button")));
        element.click();
    }

    public static WebElement getAddFlightField(WebDriver driver) {
        element = driver.findElement((By.id("hotel-flight-origin-hp-hotel")));
        return element;
    }

}
