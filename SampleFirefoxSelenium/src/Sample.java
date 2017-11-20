import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/tliu71/Downloads/selenium/geckodriver-v0.19.1-win64/geckodriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		
		dc.setCapability("marionette", true);
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("http://google.com");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e);
		}
		wd.close();
		
	}

}
