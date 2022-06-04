package com.ToolsQa.Qa.ElementPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ToolsQa.Qa.Utility.ElementUtil;

public class ElementTextBoxPage {
	WebDriver driver = null;
	Actions actions;

	// 1. Defining Page Element --> OR Object Repository
	By fullname = By.xpath("//input[@id='userName']");
	By email = By.xpath("//input[@id='userEmail']");
	By caddress = By.xpath("//textarea[@id='currentAddress']");
	By paddress = By.xpath("//textarea[@id='permanentAddress']");
	By submit = By.xpath("//button[@id='submit']");
	By output = By.xpath("//p[@id='name']");

	// 2. Initializing Page Object
	public ElementTextBoxPage(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
	}

	// 3.Actions

	public void Enternameclick() {
		WebElement uname = driver.findElement(fullname);
		ElementUtil.Element_highlight(uname, driver);
		uname.sendKeys("sun");

	}

	public void Enteremailclick() {

		WebElement uemail = driver.findElement(email);
		ElementUtil.Element_highlight(uemail, driver);
		uemail.sendKeys("Sun@gmail.com");

	}

	public void Entercaddressclick() {
		WebElement addressc = driver.findElement(caddress);
		ElementUtil.Element_highlight(addressc, driver);
		addressc.sendKeys("12345, capital city, Delhi, TN");

	}

	public void Enterpaddressclick() {
		// Select the Current Address
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// Copy the Current Address
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		// Press the TAB Key to Switch Focus to Permanent Address
		actions.sendKeys(Keys.TAB).build().perform();

		// Paste the Address in the Permanent Address field
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		WebElement addressp = driver.findElement(paddress);
		ElementUtil.Element_highlight(addressp, driver);

	}

	public void submitclick() {
		WebElement submitbt = driver.findElement(submit);

		ElementUtil.Element_highlight(submitbt, driver);
		submitbt.sendKeys("sun");

	}

	public void outputdetails() {
		WebElement outputdetails = driver.findElement(output);
		String details = outputdetails.getAttribute("Name");
		System.out.println("details : " + details);

		String details1 = outputdetails.getText();
		System.out.println("details1 : " + details1);

	}

}
