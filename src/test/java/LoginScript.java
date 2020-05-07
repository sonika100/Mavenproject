import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript {
	WebDriver driver;
	@Test
	public void launchBrowser()
	{
		String driverpath=System.getProperty("user.dir")+"\\src\\test\\java\\BrowserDriver\\chromedriver.exe";
		System.out.println(driverpath);
		System.setProperty("webdriver.chrome.driver",driverpath);
	    driver= new ChromeDriver();
	    System.out.println("hello");
	}

}
