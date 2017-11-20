import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * @author tliu71
 * 
 * Practice Exercise

    Launch new Browser
    Open DemoQA.com website
    Click on Registration link using ¡°driver.findElement(By.xpath(¡°.//*[@id=¡¯menu-item-374¡ä]/a¡±)).click();¡°
    Come back to Home page (Use ¡®Back¡¯ command)
    Again go back to Registration page (This time use ¡®Forward¡¯ command)
    Again come back to Home page (This time use ¡®To¡¯ command)
    Refresh the Browser (Use ¡®Refresh¡¯ command)
    Close the Browser

 *
 */
public class NavigateCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the FireFox driver
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/tliu71/Downloads/selenium/geckodriver-v0.19.1-win64/geckodriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		
		dc.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver();
 
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);
 
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
 
		// Go back to Home Page
		driver.navigate().back();
 
		// Go forward to Registration page
		driver.navigate().forward();
 
		// Go back to Home page
		driver.navigate().to(appUrl);
 
		// Refresh browser
		driver.navigate().refresh();
 
		// Close browser
		driver.close();
	}

}
