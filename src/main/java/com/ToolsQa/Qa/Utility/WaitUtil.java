package com.ToolsQa.Qa.Utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ToolsQa.Qa.Base.BaseClass;

public class WaitUtil extends BaseClass {

	public static void Explicit_wait(WebElement element, int value) {
		new WebDriverWait(driver, Duration.ofSeconds(value)).until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void Element_wait_tobeclick(WebElement element, long timeout) {
		new WebDriverWait(driver, Duration.ofMinutes(timeout)).until(ExpectedConditions.elementToBeClickable(element));
	}

}
