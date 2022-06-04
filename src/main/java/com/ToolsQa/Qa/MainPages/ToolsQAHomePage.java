package com.ToolsQa.Qa.MainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ToolsQa.Qa.Utility.ElementUtil;

public class ToolsQAHomePage {

	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository
	By elements = By.xpath("//h5[text()='Elements']");
	By forms = By.xpath("//h5[text()='Forms']");
	By afw = By.xpath("//h5[text()='Alerts, Frame & Windows']");
	By widgets = By.xpath("//h5[text()='Widgets']");
	By interactions = By.xpath("//h5[text()='Interactions']");
	By bookstoreapp = By.xpath("//h5[text()='Book Store Application']");
	By iframeclose = By.xpath("//label[@id='cbb']");

	// 2. Initializing Page Object
	public ToolsQAHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3.Actions
	public ToolsQAElementPage ElementsClick() {
		try {
			ElementUtil.Element_highlight(driver.findElement(elements), driver);
			ElementUtil.scroll_view(driver, elements);
			driver.findElement(elements).click();
			
		} catch (Exception e) {
			System.out.println("Error : "+e);
		}
		
		return new ToolsQAElementPage(driver);

	}

	public ToolsQAFormsPage FormsClick() {
		ElementUtil.Element_highlight(driver.findElement(forms), driver);
		driver.findElement(forms).click();
		return new ToolsQAFormsPage();

	}

	public ToolsQAAlrtFrmWinPage AlrtFrmWinClick() {
		ElementUtil.Element_highlight(driver.findElement(afw), driver);
		driver.findElement(afw).click();
		return new ToolsQAAlrtFrmWinPage();

	}

	public ToolsQAWidgetsPage WidgetsClick() {
		ElementUtil.Element_highlight(driver.findElement(widgets), driver);
		driver.findElement(widgets).click();
		return new ToolsQAWidgetsPage();
	}

	public ToolsQAInteractionsPage InteractionsClick() {
		ElementUtil.Element_highlight(driver.findElement(interactions), driver);
		driver.findElement(interactions).click();
		return new ToolsQAInteractionsPage();

	}

	public ToolsQABookStoreAppPage BookStoreAppClick() {
		ElementUtil.Element_highlight(driver.findElement(bookstoreapp), driver);
		driver.findElement(bookstoreapp).click();
		return new ToolsQABookStoreAppPage();

	}

	public void IframeCloseClick() {
		ElementUtil.Element_highlight(driver.findElement(iframeclose), driver);
		driver.findElement(iframeclose).click();

	}

}
