package org.com.restapitest.org.com.restapitest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeoLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Amazon\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Map<String,Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 28.535517);
		coordinates.put("longitude", 77.391029);
		coordinates.put("accuracy", 10);
		
		((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
			
		
		driver.manage().window().maximize();
		driver.get("https://oldnavy.gap.com/stores");
		

	}

}
