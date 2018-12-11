package cheaptickets.com.gui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


/**
 * @Author: gicastano
 */

public class flight extends accessWeb{

    public static WebElement element = null;

   /*@FindBy(xpath="//button[@id='tab-flight-tab-hp']/span")
    public WebElement flightTab;*/

    @FindBy(xpath = "//*[@id=\"flight-type-roundtrip-label-hp-flight\"]")
    public WebElement roundTripTab;

    @FindBy(xpath="//*[@id=\"flight-type-one-way-label-hp-flight\"]")
    public WebElement oneWayTab;

    @FindBy(xpath="//*[@id=\"flight-type-multi-dest-label-hp-flight\"]")
    public WebElement multiCityTab;

    @FindBy(xpath="//*[@id=\"flight-origin-hp-flight\"]")
    public WebElement departureField;

    @FindBy(xpath="//*[@id=\"flight-destination-hp-flight\"]")
    public WebElement destinationField;

    @FindBy(xpath="//*[@id=\"flight-departing-hp-flight\"]")
    public WebElement departingCalendar;

    @FindBy(xpath="//*[@id=\"flight-returning-hp-flight\"]")
    public WebElement returningCalendar;

    @FindBy(xpath="///*[@id=\"flexibleDate\"]")
    public WebElement flexibleDateCheckbox;

    @FindBy(xpath="//*[@id=\"flight-adults-hp-flight\"]")
    public WebElement adultDropdown;

    @FindBy(xpath="//*[@id=\"flight-children-hp-flight\"]")
    public WebElement childrenDropdown;

    @FindBy(xpath="//html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/fieldset[4]/a/span")
    public WebElement advancedOptionsDropdown;

    @FindBy(xpath="//*[@id=\"advanced-flight-nonstop-hp-flight\"]")
    public WebElement nonStopCheckbox;

    @FindBy(xpath="//*[@id=\"advanced-flight-refundable-label-hp-flight\"]")
    public WebElement refundableFlightCheckbox;

    @FindBy(xpath="//*[@id=\"flight-advanced-preferred-airline-hp-flight\"]")
    public WebElement preferredAirlineDropdown;

    @FindBy(xpath="//*[@id=\"flight-advanced-preferred-class-hp-flight\"]")
    public WebElement preferredClass;

    @FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[6]/label[1]")
    public WebElement addHotelCheckbox;

    @FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[6]/label[2]")
    public WebElement addCarCheckbox;

    @FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[9]/label/button")
    public WebElement searchButton;


    public static void clickOnFlightTab(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']/span"));
        element.click();
    }

   /* public void setRoundTripTab(WebElement roundTripTab) {
        this.roundTripTab=roundTripTab;
        roundTripTab.click();
    }*/

    /*public void setDepartureField(WebElement departureField) {
        this.departureField = departureField;
        departureField.sendKeys("Medellin, Colombia (MDE-Jose Maria Cordova Intl.)");
    }

    public void setDestinationField(WebElement destinationField) {
        this.destinationField = destinationField;
        destinationField.sendKeys("Miami, FL (MIA-Miami Intl.)");
    }

    public void setDepartingCalendar(WebElement departingCalendar) {
        this.departingCalendar = departingCalendar;
        departingCalendar.sendKeys("12/31/2018");
    }

    public void setReturningCalendar(WebElement returningCalendar) {
        this.returningCalendar = returningCalendar;
        returningCalendar.sendKeys("12/31/2018");
    }

    public void setNonStopCheckbox(WebElement nonStopCheckbox) {
        this.nonStopCheckbox = nonStopCheckbox;
        nonStopCheckbox.click();
    }

    public void setAdultDropdown(WebElement adultDropdown) {
        this.adultDropdown = adultDropdown;
       // adultDropdown.selectByIndex("2");
    }

    public void setChildrenDropdown(WebElement childrenDropdown) {
        this.childrenDropdown = childrenDropdown;
       // childrenDropdown.selectByIndex("1");
    }

    public void setAdvancedOptionsDropdown(WebElement advancedOptionsDropdown) {
        this.advancedOptionsDropdown = advancedOptionsDropdown;
        advancedOptionsDropdown.click();
    }

    public void setRefundableFlightCheckbox(WebElement refundableFlightCheckbox) {
        this.refundableFlightCheckbox = refundableFlightCheckbox;
        refundableFlightCheckbox.click();
    }


    public void setPreferredAirlineDropdown(WebElement preferredAirlineDropdown) {
        this.preferredAirlineDropdown = preferredAirlineDropdown;
        //preferredAirlineDropdown.selectByIndex("2");
    }

    public void setPreferredClass(WebElement preferredClass){
        this.preferredClass = preferredClass;
        //preferredClass.selectByIndex("1");
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
        searchButton.click();
    }*/
}

