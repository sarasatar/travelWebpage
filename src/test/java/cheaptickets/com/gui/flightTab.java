package cheaptickets.com.gui;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author: gicastano
 */

public class flightTab {


    @FindBy(xpath="//button[@id='tab-flight-tab-hp']/span")
    private WebElement flightTab;

    @FindBy(xpath="//*[@id=\"flight-type-roundtrip-label-hp-flight\"]")
    private WebElement roundTripTab;

    @FindBy(xpath="//*[@id=\"flight-type-one-way-label-hp-flight\"]")
    private WebElement oneWayTab;

    @FindBy(xpath="//*[@id=\"flight-type-multi-dest-label-hp-flight\"]")
    private WebElement multiCityTab;

    @FindBy(xpath="//*[@id=\"flight-origin-hp-flight\"]")
    private WebElement departureField;

    @FindBy(xpath="//*[@id=\"flight-destination-hp-flight\"]")
    private WebElement destinationTab;

    @FindBy(xpath="//*[@id=\"flight-departing-hp-flight\"]")
    private WebElement departingCalendar;

    @FindBy(xpath="//*[@id=\"flight-returning-hp-flight\"]")
    private WebElement returningCalendar;

    @FindBy(xpath="///*[@id=\"flexibleDate\"]")
    private WebElement flexibleDateCheckbox;

    @FindBy(xpath="//*[@id=\"flight-adults-hp-flight\"]")
    private WebElement adultDropdown;

    @FindBy(xpath="//*[@id=\"flight-children-hp-flight\"]")
    private WebElement childrenDropdown;

    @FindBy(xpath="//html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/fieldset[4]/a/span")
    private WebElement advancedOptionsDropdown;

    @FindBy(xpath="//*[@id=\"advanced-flight-nonstop-hp-flight\"]")
    private WebElement nonStopCheckbox;

    @FindBy(xpath="//*[@id=\"advanced-flight-refundable-label-hp-flight\"]")
    private WebElement refundableFlightCheckbox;

    @FindBy(xpath="//*[@id=\"flight-advanced-preferred-airline-hp-flight\"]")
    private WebElement preferredAirlineDropdown;

    @FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[6]/label[1]")
    private WebElement addHotelCheckbox;

    @FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[6]/label[2]")
    private WebElement addCarCheckbox;

    @FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[9]/label/button")
    private WebElement searchButton;

}
