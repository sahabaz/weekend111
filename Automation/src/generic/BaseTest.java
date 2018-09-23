package generic;

import java.io.IOException;
import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst
{
	public static RemoteWebDriver  d;
	
	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String browser) throws EncryptedDocumentException, IOException, InterruptedException
	{
//		System.setProperty(CHRME_KEY, CHROME_VALUE);
//		d = new ChromeDriver();
//		d.get(Excel.readData("Sheet1" , 0 , 1));
		URL url = new URL("http://192.168.1.29:4444/wd/hub/");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		d = new RemoteWebDriver(url , dc);
		d.get(Excel.readData("Sheet1" , 0 , 1));
		Thread.sleep(3000);
	}
	
//	@AfterMethod
//	public void postCondition()
//	{                                                                                                                                                                     
//		d.close();
//	}
}
