package com.banking.Digi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Googlehome {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		
		String appurl="https://www.google.com/";
		driver.get(appurl);
		String title=driver.getTitle();
		
		if (title.equals("Google"))
		{
			System.out.println("Directed to required page " +title);
		}
			else 
				
		{
				System.out.println("Directed to reqiored page " +title);
		}

		String url=driver.getCurrentUrl();
		
		if (url.contains("google.co.in"))

	{
			System.out.println("URL pass  " +url);
	}
		else 
			
		{
				System.out.println("URL fail " +url);
		}
		
		driver.close();
	}
	

}
