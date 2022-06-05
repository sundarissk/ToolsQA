package com.ToolsQa.Qa.MainPages;

import static com.ToolsQa.Qa.Utility.ElementUtil.ClickElement;
import static com.ToolsQa.Qa.Utility.ElementUtil.Element_highlight;
import static com.ToolsQa.Qa.Utility.FunctionUtil.getcount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ToolsQa.Qa.ElementPages.ElementTextBoxPage;

public class ToolsQAElementPage {

	WebDriver driver = null;

	// 1. Defining Page Element --> OR Object Repository

	static final By elementdrop = By.xpath("//div[@class='element-group'][1]//div[@class='icon']");
	static final By elementlist = By.xpath("//div[@class='element-group'][1]//li");
	static final By txtbox = By.xpath("//span[text()='Text Box']");
	static final By chkbox = By.xpath("//span[text()='Check Box']");
	static final By radiobtn = By.xpath("//span[text()='Radio Button']");
	static final By webtable = By.xpath("//span[text()='Web Tables']");
	static final By button = By.xpath("//span[text()='Buttons']");
	static final By links = By.xpath("//span[text()='Links']");
	static final By brokenlinks = By.xpath("//span[text()='Broken Links - Images']");
	static final By updownload = By.xpath("//span[text()='Upload and Download']");
	static final By dynamicprop = By.xpath("//span[text()='Dynamic Properties']");

	// 2. Initializing Page Object
	public ToolsQAElementPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3.Actions
	public void ElementDropClick() {
		try {
			Element_highlight(driver, elementdrop);
			ClickElement(driver, elementdrop, 30);
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

	}

	public int ElementCountCheck() {
		int count = getcount(driver, elementlist);
		return count;
	}

	public ElementTextBoxPage TextBoxClick() {
		try {
			Element_highlight(driver, txtbox);
			ClickElement(driver, txtbox, 30);

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

		return new ElementTextBoxPage(driver);
	}

}
