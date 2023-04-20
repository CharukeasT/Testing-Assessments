package com.selenium.cia1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn3 {
	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		String name = driver.getTitle();
		System.out.println(name);
		String title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(name.equals(title)) {
			System.out.println("Validated Page Title");
		}
driver.findElement(By.id("nav-link-accountList")).click();
    	
    	
		driver.findElement(By.id("ap_email")).sendKeys("8300058811");
		driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ap_password")).sendKeys("charu@333");
		driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String name1=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		if(name1.equals("Hello, Charukeas")) {
			System.out.println("Successfully, signed in as Charukeas");
		}else {
			System.out.println("Sign in failed");
		}
		System.out.println("Testing Ended");
		
    	driver.quit();

	}
}
