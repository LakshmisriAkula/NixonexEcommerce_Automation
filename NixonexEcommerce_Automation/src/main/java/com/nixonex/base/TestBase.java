package com.nixonex.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import com.nixonex.utils.ScreenshotUtil;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static ExtentTest logger;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"E:\\StarAgile - NixonexEcommerce_Automation\\NixonexEcommerce_Automation\\NixonexEcommerce_Automation\\src\\main\\java\\com\\nixonex\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}

	public static void initialization(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Unsupported browser: " + browserName);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));

	}

	protected void logWithScreenshot(String message) {
		String path = ScreenshotUtil.captureScreenshot(driver, message.replace(" ", "_"));
		if (logger != null) {
			logger.log(Status.INFO, message).addScreenCaptureFromPath(path);
		} else {
			System.out.println("⚠️ Logger is null. Screenshot taken: " + path);
		}
	}

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}

}
