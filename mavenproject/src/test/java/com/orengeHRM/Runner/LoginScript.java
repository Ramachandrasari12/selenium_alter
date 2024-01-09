package com.orengeHRM.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orengeHRM.generic.Base_class_orengehrm;

public class LoginScript extends Base_class_orengehrm{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[text()='gzbrfab rhxbazd']")).click();
		Thread.sleep(1000);
        driver.findElement(By.name("//a[text()='Logout']")).click();		

      }
	

}
