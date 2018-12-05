package cheaptickets.com.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

/**
 * @Author: gicastano
 */

public class webDriver {

   public static void main(String[] args) throws InterruptedException {

      // Initialize browser: chrome
      WebDriver driver = new ChromeDriver();

      String baseURL = "https://www.cheaptickets.com/";
      sleep(5000);

      // Open url
      driver.get(baseURL);

}

}
