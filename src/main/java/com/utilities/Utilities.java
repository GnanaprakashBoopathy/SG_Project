package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.PageObjectManager;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Utilities {
	
	public static WebDriver driver;
	public static PageObjectManager pom;
	public static Scenario scenario;
	
	public void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			// options.setHeadless(true);
			driver = new ChromeDriver(options);
		}
		else {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			// options.setHeadless(true);
			driver = new EdgeDriver(options);
		}
		
		driver.manage().window().maximize();
		
	}
	
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	public void iWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void textInput(WebElement element, String text) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	}
	public void clickAction(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public static String excelRead(String dsLocation, String pageName, int rowNo, String cellName) throws FileNotFoundException, IOException {
		String value = null;
		try {
			 XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(dsLocation)));
			 XSSFSheet sheet = workbook.getSheet(pageName);
			for (int i = 0; i < sheet.getRow(0).getPhysicalNumberOfCells(); i++) {
				if (sheet.getRow(0).getCell(i).toString().equalsIgnoreCase(cellName)) {
					XSSFCell cell = sheet.getRow(rowNo).getCell(i);
					String type = cell.getCellType().toString();
					if (type.equals("STRING")) {
						value = cell.toString().trim();
					} else {
						value = null;
					}
				}
			}
			workbook.close();
		} catch (NullPointerException e) {
		}
		return value;
	}	
	
	public void equalAssert(String text1, String text2) {
		Assert.assertEquals(text1, text2, "Both text didnot match");
	}
	public String textFromElement(WebElement element) {
		return element.getText();
	}
	public void logText(String text) {
		System.out.println(text);
		scenario.write(text);
	}
	

}
