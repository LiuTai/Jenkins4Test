import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/tliu71/Downloads/selenium/geckodriver-v0.19.1-win64/geckodriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		
		dc.setCapability("marionette", true);
		
		
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.gcrit.com/build3/admin/");
		wd.findElement(By.name("username")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin@123");
		wd.findElement(By.id("tdb1")).click();
		
		String url = wd.getCurrentUrl();
		
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
		//wd.close();
		
	}
}
