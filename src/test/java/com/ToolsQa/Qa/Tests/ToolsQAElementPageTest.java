package com.ToolsQa.Qa.Tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ToolsQa.Qa.Base.BaseClass;
import com.ToolsQa.Qa.ElementPages.ElementTextBoxPage;
import com.ToolsQa.Qa.MainPages.ToolsQAElementPage;
import com.ToolsQa.Qa.MainPages.ToolsQAHomePage;
import com.ToolsQa.Qa.Utility.ElementUtil;

public class ToolsQAElementPageTest extends BaseClass {
	WebDriver driver;
	String path = "C:\\Users\\skuma\\Local-Repo\\ToolsQA\\driver\\chromedriver.exe";
	ToolsQAHomePage hp;
	ToolsQAElementPage ep;
	ElementTextBoxPage tp;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get(prop.getProperty("url"));

	}

	@Test(priority = 1)
	public void ElementPageTest() throws InterruptedException {
		hp = new ToolsQAHomePage(driver);
		ep = new ToolsQAElementPage(driver);
		ElementUtil.switchframesindex(driver, 0);
		hp.IframeCloseClick();
		ElementUtil.switchiframeback(driver);

		hp.ElementsClick();

		Thread.sleep(1000);

		ep.ElementDropClick();
		int c = ep.ElementCountCheck();
		System.out.println("No of Elments Tab : " + c);
		Assert.assertEquals(9, c);
		ep.TextBoxClick();

	}

	@Test(priority = 2)
	public void ElementTextBoxTest() throws InterruptedException {
		tp = new ElementTextBoxPage(driver);
		tp.Enternameclick();
		tp.Enteremailclick();
		tp.Entercaddressclick();
		tp.Enterpaddressclick();
		//Thread.sleep(2000);
		tp.submitclick();
		
		tp.outputdetails();
		Thread.sleep(2000);
		

	}

	@AfterTest
	public void closing() {
		driver.close();
		driver.quit();
	}
}
