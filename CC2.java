package com.selenium.test1.SoloExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC2 {
  @Test
  public void function() throws Exception {
	WebDriverManager.edgedriver().setup();
   	WebDriver driver=new EdgeDriver();
   	driver.get("https://www.yatra.com/hotels");
   	driver.manage().window().maximize();
   	driver.findElement(By.id("booking_engine_flights")).click();
   	driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a")).click();
   	WebElement departFrom = driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
   	departFrom.click();
   	Thread.sleep(3000);
   	WebElement departFromvalue=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[3]/div[1]/p[1]"));
   	departFromvalue.click();
   	WebElement arrivalAt = driver.findElement(By.id("BE_flight_arrival_city"));
   	arrivalAt.click();
   	Thread.sleep(3000);
   	WebElement arrivalAtvalue=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[4]"));
   	arrivalAtvalue.click();
   	driver.findElement(By.id("BE_flight_origin_date")).click();
   	Thread.sleep(3000);
   	driver.findElement(By.xpath("//*[@id=\"25/04/2023\"]")).click();
   	Thread.sleep(3000);
   	driver.findElement(By.xpath("//*[@id=\"27/04/2023\"]")).click();
   	driver.findElement(By.className("chkbox-disabled")).click();
   	driver.findElement(By.id("BE_flight_flsearch_btn")).click();
  }
}
