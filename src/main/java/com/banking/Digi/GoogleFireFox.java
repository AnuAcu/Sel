package com.banking.Digi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class GoogleFireFox {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new FirefoxDriver();
		 
		 String appurl="https://www.google.com/";
		 driver.get(appurl);
		 driver.getTitle();
			System.out.println("Directed to " + driver.getTitle());
			Thread.sleep(1000);
   driver.close();
	
	}

}
