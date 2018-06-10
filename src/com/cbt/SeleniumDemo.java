package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/ahmet/Documents/Selenium dependencies/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cybertekSchool.com");
	}

}
