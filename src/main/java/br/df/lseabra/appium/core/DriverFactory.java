package br.df.lseabra.appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	private static  AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
		
	}
	
	
	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    //desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	    //desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	    //Tenta instalar a aplicação
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:/Users/55619/eclipse-workspace/Appium/src/main/resources/CTAppium_1_2.apk");
	    
	    
	    try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //ao clicar em salvarDemorado por ex, o sistema não apresenta erro por conta desse implicitlyWait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}		
	}
}
