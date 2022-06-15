package com.ToolsQa.Qa.Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	public static void Element_highlight(WebDriver driver, By locator) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", driver.findElement(locator));

	}

	public static void mouseover(WebDriver driver, By locator) {
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(locator);
		actions.moveToElement(target).click().perform();

	}

	public static void ScrollToView(WebDriver driver, By locator) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
	}

	public static void SendKeys(WebDriver driver, By locator, String value) {
		WebElement E1 = driver.findElement(locator);
		E1.sendKeys(value);
	}

	public static void ClickElement(WebDriver driver, By locator) {
		WebElement E1 = driver.findElement(locator);
		E1.click();

	}

	public static WebElement LocatorToElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> LocatorToElements(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

	
}
