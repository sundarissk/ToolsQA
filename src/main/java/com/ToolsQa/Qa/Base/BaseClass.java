package com.ToolsQa.Qa.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public BaseClass() {

		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\skuma\\Local-Repo\\ToolsQA\\src\\main\\java\\com\\ToolsQa\\Qa\\Config\\Config.properties");
			prop.load(ip);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}

	public synchronized static WebDriver getDriver() {
		return tdriver.get();
	}

	public String getbroswername() {
		Capabilities browserCap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = browserCap.getBrowserName();
		return browserName;

	}

}
