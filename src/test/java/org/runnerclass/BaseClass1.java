package org.runnerclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

		public static WebDriver driver;

		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}
		public static void launchUrl(String url) {
			driver.get(url);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void currentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
		}
	    public static void gettitle() {
			String title = driver.getTitle();
			System.out.println(title);
		
		    }
	    public static void fill(WebElement element, String text) {
			element.sendKeys(text);
		}
	    public static void close() {
			driver.close();
		}
	  public static void dateandtime() {
		java.util.Date d= new java.util.Date();
		System.out.println(d);
	}
	    public static void click(WebElement name) {
			name.click();
		}
	    public static void sleep(long millis) throws InterruptedException {
			Thread.sleep(millis);
		}
	}


