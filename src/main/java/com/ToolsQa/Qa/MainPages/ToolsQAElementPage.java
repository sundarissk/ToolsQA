package com.ToolsQa.Qa.MainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ToolsQa.Qa.ElementPages.ElementTextBoxPage;
import com.ToolsQa.Qa.Utility.ElementUtil;
import com.ToolsQa.Qa.Utility.WaitUtil;

public class ToolsQAElementPage {

	WebDriver driver = null;

	// 1. Defining Page Element --> OR Object Repository

	By elementdrop = By.xpath("//div[@class='element-group'][1]//div[@class='icon']");
	By elementlist = By.xpath("//div[@class='element-group'][1]//li");
	By txtbox = By.xpath("//span[text()='Text Box']");
	By chkbox = By.xpath("//span[text()='Check Box']");
	By radiobtn = By.xpath("//span[text()='Radio Button']");
	By webtable = By.xpath("//span[text()='Web Tables']");
	By button = By.xpath("//span[text()='Buttons']");
	By links = By.xpath("//span[text()='Links']");
	By brokenlinks = By.xpath("//span[text()='Broken Links - Images']");
	By updownload = By.xpath("//span[text()='Upload and Download']");
	By dynamicprop = By.xpath("//span[text()='Dynamic Properties']");

	// 2. Initializing Page Object
	public ToolsQAElementPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3.Actions
	public void ElementDropClick() {
		try {
			WaitUtil.Element_wait_tobeclick(driver.findElement(elementdrop), 60, driver);
			ElementUtil.Element_highlight(driver.findElement(elementdrop), driver);
			driver.findElement(elementdrop).click();
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

	}

	public int ElementCountCheck() {
		int count = driver.findElements(elementlist).size();
		return count;
	}

	public ElementTextBoxPage TextBoxClick() {
		try {
			WaitUtil.Element_wait_tobeclick(driver.findElement(txtbox), 30, driver);
			ElementUtil.Element_highlight(driver.findElement(txtbox), driver);
			driver.findElement(txtbox).click();

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

		return new ElementTextBoxPage(driver);
	}

}
