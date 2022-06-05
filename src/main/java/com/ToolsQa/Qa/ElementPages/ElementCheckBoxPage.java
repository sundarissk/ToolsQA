package com.ToolsQa.Qa.ElementPages;

import org.openqa.selenium.By;
/*

checkbox:
1. Locate : identified by --> ID,Xpath,CSS selector
2. Validate : isSelected(), isDisplayed(), isEnabled

*/
public class ElementCheckBoxPage {
	// 1. 1. Defining Page Element --> OR Object Repository
	
	static final By plus = By.xpath("//button[@title='Expand all']");
	static final By minus = By.xpath("//button[@title='Collapse all']");

	static final By homechk = By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']");

	static final By desktopchk = By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']");
	static final By dsknoteschk = By.xpath("//label[@for ='tree-node-notes']//span[@class='rct-checkbox']");
	static final By dskcommandschk = By.xpath("//label[@for ='tree-node-commands']//span[@class='rct-checkbox']");

	static final By docworkspacechk = By.xpath("//label[@for='tree-node-workspace']//span[@class='rct-checkbox']");
	static final By reactchk = By.xpath("//label[@for='tree-node-react']//span[@class='rct-checkbox']");
	static final By angularchk = By.xpath("//label[@for='tree-node-angular']//span[@class='rct-checkbox']");
	static final By veuchk = By.xpath("//label[@for='tree-node-veu']//span[@class='rct-checkbox']");

	static final By docofficechk = By.xpath("//label[@for='tree-node-office']//span[@class='rct-checkbox']");
	static final By publicchk = By.xpath("//label[@for='tree-node-public']//span[@class='rct-checkbox']");
	static final By privatechk = By.xpath("//label[@for='tree-node-private']//span[@class='rct-checkbox']");
	static final By classifiedchk = By.xpath("//label[@for='tree-node-classified']//span[@class='rct-checkbox']");
	static final By generalchk = By.xpath("//label[@for='tree-node-general']//span[@class='rct-checkbox']");

	static final By downloadchk = By.xpath("//label[@for='tree-node-downloads']//span[@class='rct-checkbox']");
	static final By dwnworkfile = By.xpath("//label[@for='tree-node-wordFile']//span[@class='rct-checkbox']");
	static final By dwnexcelfile = By.xpath("//label[@for='tree-node-excelFile']//span[@class='rct-checkbox']");

	// 2. Initializing Page Object

	// 3.Actions

}
