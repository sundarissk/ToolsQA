package com.ToolsQa.Qa.Utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ToolsQa.Qa.Base.BaseClass;

public class ElementUtil extends BaseClass {

	public static void Element_highlight(WebElement ele) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", ele);

	}

	public static void Element_sendkeys(WebElement element, long timeout, String value) {
		WebElement E1 = new WebDriverWait(driver, Duration.ofMinutes(timeout))
				.until(ExpectedConditions.elementToBeClickable(element));
		E1.sendKeys(value);
	}

	public static void Element_Click(WebElement element, long timeout) {
		WebElement E1 = new WebDriverWait(driver, Duration.ofMinutes(timeout))
				.until(ExpectedConditions.elementToBeClickable(element));
		E1.click();
	}

	public static String Element_gettext(WebElement element) {

		return element.getText();

	}

	public static String gettitile() {

		return driver.getTitle();

	}

}
