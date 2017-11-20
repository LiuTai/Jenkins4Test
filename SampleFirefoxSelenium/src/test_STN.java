import org.testng.Assert;
import org.testng.annotations.Test;

public class test_STN {
	String message = "Hello World";
	SampleTestNg stn = new SampleTestNg(message);
	
	@Test
	public void testPrintMessage() {
		Assert.assertEquals(message,stn.printMessage());
	}
}
