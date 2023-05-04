package tests;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	AppiumDriver driver;
	//Test annotation this function is called before the test starts
	@BeforeTest 
	public void setup(){
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("AUTOMATION_NAME","Appium");
			cap.setCapability("deviceName", "vivo Y15C");
			cap.setCapability("udid", "13853760010000J");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12"); //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 60);
			//		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); //For the browser testing

			cap.setCapability("appPackage", "com.vivo.calculator");
			cap.setCapability("appActivity", "com.vivo.calculator.Calculator");


			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver(url, cap);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cause is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();


		}
		
	}

	//Test annotation after the test completed	
	@AfterTest 
	public void teardown(){
		driver.quit();
	}
}
