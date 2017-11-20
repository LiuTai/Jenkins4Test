import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the FireFox driver
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/tliu71/Downloads/selenium/geckodriver-v0.19.1-win64/geckodriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		
		dc.setCapability("marionette", true);
		
		WebDriver wd = new FirefoxDriver();
		
 
		// Storing the Application Url in the String variable
		String url = "http://www.store.demoqa.com";
 
		//Launch the ToolsQA WebSite
		wd.get(url);
		// Storing Title name in the String variable
		
		String pageTitle = wd.getTitle();
		// Storing Title length in the Int variable
		int titleLength = pageTitle.length();
		// Printing Title & Title length in the Console window
		System.out.println(pageTitle);
		System.out.println(titleLength);
		// Storing URL in String variable
		
			//In case of Fail, you like to print the actual and expected URL for the record purpose
 
		// Storing Page Source in String variable
 
		// Storing Page Source length in Int variable
 
		// Printing length of the Page Source on console
 
		//Closing browser
		wd.close();

	}

}
