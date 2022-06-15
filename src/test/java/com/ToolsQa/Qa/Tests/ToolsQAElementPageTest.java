package com.ToolsQa.Qa.Tests;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ToolsQa.Qa.Base.DriverManager;
import com.ToolsQa.Qa.ElementPages.ElementCheckBoxPage;
import com.ToolsQa.Qa.ElementPages.ElementRadioButtonPage;
import com.ToolsQa.Qa.ElementPages.ElementTextBoxPages;
import com.ToolsQa.Qa.MainPages.ToolsQAElementPage;
import com.ToolsQa.Qa.MainPages.ToolsQAHomePage;

public class ToolsQAElementPageTest extends DriverManager {

	String path = "C:\\Users\\skuma\\Local-Repo\\ToolsQA\\driver\\chromedriver.exe";
	ToolsQAHomePage hp;
	ToolsQAElementPage ep;
	ElementTextBoxPages tp;
	ElementCheckBoxPage cp;
	ElementRadioButtonPage rb;

	@BeforeTest
	public void SetUp() {
		SetUpBrowser();
		SetUpURL();
		hp = new ToolsQAHomePage(driver);
		ep = new ToolsQAElementPage(driver);
		tp = new ElementTextBoxPages(driver);
		cp = new ElementCheckBoxPage(driver);
		rb = new ElementRadioButtonPage(driver);
	}

	@Test(priority = 1)
	public void ElementClickTest() throws InterruptedException {

		// switchframesindex(driver, 0);
		// hp.IframeCloseClick();
		// switchiframeback(driver);

		hp.ElementsClick();

		Thread.sleep(1000);

		ep.ElementDropClick();
		// ep.ElementDropClick();

		int c = ep.ElementCountCheck();
		System.out.println("No of Elments Tab : " + c);
		Assert.assertEquals(9, c);

	}

	@Test(priority = 2)
	public void ElementTextBoxTest() throws InterruptedException {

		ep.TextBoxClick();

		tp.Enternameclick();
		tp.Enteremailclick();
		tp.Entercaddressclick();
		tp.Enterpaddressclick();
		tp.submitclick();
		tp.outputdetails();

	}

	@Test(priority = 3)
	public void ElementCheckBoxTest() throws InterruptedException {
		ep.ElementCheckBoxCheck();

		cp.PlusClick();

		cp.DesktopClickCheck("desktop");
		cp.ResultPrinting();

		cp.DocumentsClick("veu");
		cp.ResultPrinting();

		cp.DownloadsClick("wordfile");
		cp.ResultPrinting();

		cp.MinusClick();
	}

	@Test(enabled = false)
	public void ElementCheckBoxHomeClickTest() {

		ep.ElementCheckBoxCheck();

		cp.PlusClick();
		cp.HomeClick();
		cp.ResultPrinting();
		cp.MinusClick();
	}

	@Test(priority = 4)
	public void ElementRadioButtonClickTest() throws InterruptedException {

		ep.ElementRadioButtonCheck();
		rb.RadioClick("yes");
		Thread.sleep(2000);
		rb.ResultPrinting(); //no need this for 'No' beacuse it is disabled

		

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
