package com.ToolsQa.Qa.Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	public static void Element_highlight(WebElement element, WebDriver driver) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", element);

	}

	public static void mouseover(WebDriver driver, By element) {
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(element);
		actions.moveToElement(target).click().perform();

	}
	public static void scroll_view(WebDriver driver, By Locator) {
		WebElement element = driver.findElement(Locator);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void Element_sendkeys(WebElement element, long timeout, String value, WebDriver driver) {
		WebElement E1 = new WebDriverWait(driver, Duration.ofMinutes(timeout))
				.until(ExpectedConditions.elementToBeClickable(element));
		E1.sendKeys(value);
	}

	public static void Element_Click(WebElement element, long timeout, WebDriver driver) {
		WebElement E1 = new WebDriverWait(driver, Duration.ofMinutes(timeout))
				.until(ExpectedConditions.elementToBeClickable(element));
		E1.click();
	}

	public static String Element_gettext(WebElement element, WebDriver driver) {

		return element.getText();

	}

	public static void switchframesindex(WebDriver driver, int n) {
		driver.switchTo().frame(n);
	}

	public static void switchiframeback(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static String gettitile(WebDriver driver) {

		return driver.getTitle();

	}

}
