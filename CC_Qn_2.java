package com.selenium.cia1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC_Qn_2{
	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement user = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.id("login-button"));
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		submit.click();
		WebElement drop = driver.findElement(By.className("product_sort_container"));
		drop.click();
		Select select= new Select(drop);
    	select.selectByVisibleText("Name (A to Z)");
    	Thread.sleep(4000);
    	WebElement pro1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
    	if(pro1.getText().equals("Name (A to Z)")) {
    		System.out.println("Able to apply filter A-Z");
    	}
    	Thread.sleep(4000);
    	pro1.click();
    	WebElement prod1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
    	System.out.println("First product name while filtering from A-Z :-"+prod1.getText());
    	
    	WebElement pro2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
    	if(pro2.getText().equals("Name (Z to A)")) {
    		System.out.println("Able to apply filter Z-A");
    	}    	
    	pro2.click();
    	Thread.sleep(4000);
    	WebElement prod2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
    	System.out.println("First product name while filtering from Z-A :-"+prod2.getText());
    	
    	WebElement pro3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
    	if(pro3.getText().equals("Price (low to high)")) {
    		System.out.println("Able to apply filter Low-High");
    	}    	
    	pro3.click();
    	Thread.sleep(4000);
    	WebElement prod3=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
    	System.out.println("First product name while filtering from Price (low to high) :-"+prod3.getText());
    	
    	WebElement pro4=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
    	if(pro4.getText().equals("Price (high to low)")) {
    		System.out.println("Able to apply filter High-Low");
    	}    	
    	pro4.click();
    	Thread.sleep(4000);
    	WebElement prod4=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
    	System.out.println("First product name while filtering from Price (high to low) :-"+prod4.getText());
	}
}
