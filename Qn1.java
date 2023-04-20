package com.selenium.cia1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn1 {
	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String name = driver.getTitle();
		System.out.println(name);
		String title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(name.equals(title)) {
			System.out.println("Validated Page Title");
		}
		driver.get("https://www.amazon.in/Boult-Audio-Wireless-Playtime-Bluetooth/dp/B0BQN2RMJF/ref=sr_1_1_sspa?keywords=realme%2Bearbuds&qid=1681292045&s=electronics&sprefix=realme%2Bear%2Celectronics%2C318&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addToCart.click();
		String addToCartCheck = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
		String addToCartMessage = "Added to Cart";
		if(addToCartMessage.equals(addToCartCheck)) {
			System.out.println("Verified adding a product to cart");
		}
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		driver.findElement(By.cssSelector("[value='Delete']")).click();  
		
		driver.findElement(By.name("submit.addToCart")).click();  
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		System.out.println("Product Updated");
		
		driver.findElement(By.name("proceedToRetailCheckout")).click();  
		System.out.println("To proceed to purchase,You need to sign in");
	}
}
