package com.selenium.cia1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC_Qn_1 {
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
		 WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 addToCart.click();
		 String count = driver.findElement(By.id("remove-sauce-labs-backpack")).getText();
		 if(count.equals("Remove")) {
			 System.out.println("Product added to Cart successfully");			 
		 }else {
			 System.out.println("Product not added to Cart");
		 }
		 WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		 cart.click();
		 String product = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		 if(product.equals("Sauce Labs Backpack")) {
			 System.out.println("Product is viewable in the Cart");
		 }else {
			 System.out.println("Product is not viewable in the Cart");
		 }
		 driver.findElement(By.id("checkout")).click();
		 String checkout = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		 if(checkout.equals("Checkout: Your Information")) {
			 System.out.println("Your information form is displayed");
		 }else {
			 System.out.println("Ypur information form is not displayed");
		 }
		 driver.findElement(By.id("first-name")).sendKeys("Charu");
		 driver.findElement(By.id("last-name")).sendKeys("Keys");
		 driver.findElement(By.id("postal-code")).sendKeys("626130");
		 driver.findElement(By.id("continue")).click();
		 String formFilled = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		 if(formFilled.equals("Checkout: Overview")) {
			 System.out.println("Product overview is displayed");
		 }else {
			 System.out.println("Product overview is not displayed");
		 }
		 String name = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		 String price = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
		 System.out.println("Name  : " + name);
		 System.out.println("Price : " + price);
		 String title = driver.getTitle();
		 if(title.equals("Swag Labs")) {
			 System.out.println("Asserted the title of the page");
		 }else {
			 System.out.println("The title of the page is not matching");
		 }
		 String url = driver.getCurrentUrl();
		 if(url.equals("https://www.saucedemo.com/checkout-step-two.html")) {
			 System.out.println("Asserted the URL of the page");
		 }else {
			 System.out.println("The URL of the page is not matching");
		 }
	}
}
