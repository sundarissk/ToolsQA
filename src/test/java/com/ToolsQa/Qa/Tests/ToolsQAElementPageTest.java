package com.ToolsQa.Qa.Tests;

import static com.ToolsQa.Qa.Utility.FunctionUtil.switchframesindex;
import static com.ToolsQa.Qa.Utility.FunctionUtil.switchiframeback;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ToolsQa.Qa.Base.DriverManager;
import com.ToolsQa.Qa.ElementPages.ElementTextBoxPage;
import com.ToolsQa.Qa.MainPages.ToolsQAElementPage;
import com.ToolsQa.Qa.MainPages.ToolsQAHomePage;

public class ToolsQAElementPageTest extends DriverManager {

	String path = "C:\\Users\\skuma\\Local-Repo\\ToolsQA\\driver\\chromedriver.exe";
	ToolsQAHomePage hp;
	ToolsQAElementPage ep;
	ElementTextBoxPage tp;

	@BeforeTest
	public void SetUp() {
		SetUpBrowser();
		SetUpURL();
		hp = new ToolsQAHomePage(driver);
		ep = new ToolsQAElementPage(driver);
	}

	@Test(priority = 1)
	public void ElementClickTest() throws InterruptedException {
		
		switchframesindex(driver, 0);
		hp.IframeCloseClick();
		switchiframeback(driver);

		hp.ElementsClick();

		Thread.sleep(1000);

		ep.ElementDropClick();
		int c = ep.ElementCountCheck();
		System.out.println("No of Elments Tab : " + c);
		Assert.assertEquals(9, c);
		// ep.TextBoxClick();

	}

	@Test(priority = 2)
	public void ElementTextBoxTest() throws InterruptedException {
		
		ep.TextBoxClick();
		tp = new ElementTextBoxPage(driver);
		tp.Enternameclick();
		tp.Enteremailclick();
		tp.Entercaddressclick();
		tp.Enterpaddressclick();
		tp.submitclick();
		tp.outputdetails();

	}

	@AfterMethod
	public void EndOfMethod() {

		System.out.println("***************************************************************");
	}

	@AfterTest
	public void closing() {
		ClosingDown();
	}
}
