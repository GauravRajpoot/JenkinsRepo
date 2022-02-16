package com.nagarro.com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.v3.ExtentManagerv5;
public class ExtentTests {
public static WebDriver driver ;
	private ExtentReports extent=new ExtentReports();
	private ExtentSparkReporter spark =new ExtentSparkReporter("extent.html");
	
	@BeforeSuite
	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		extent.attachReporter(spark);
		System.out.println(driver);
	}
	
	@Test()
	public void Seleniumtest2() {
		ExtentTest test=extent.createTest("*****First*****").createNode("first").assignAuthor("Gaurav").assignCategory("Regression").assignDevice("Windows");
		test.log(Status.PASS, "V5 pass");
		test.pass("Pass ho gaye ");
		test.createNode("DEMO to paaji");
		test.pass("ggggggg ho gaye ");
		System.out.println("In test 1");
	}
	@Test()
	public void Seleniumtest1() {
		ExtentTest test=extent.createTest("*****Second*****").createNode("first").assignAuthor("Gaurav").assignCategory("Regression").assignDevice("Windows");
		test.log(Status.PASS, "V5 pass");
		test.pass("Pass ho gaye ");
		System.out.println("In test 1");
	}
	@Test()
	public void Seleniumtest3() {
		ExtentTest test=extent.createTest("*****Third*****").createNode("first").assignAuthor("Gaurav").assignCategory("Regression").assignDevice("Windows");
		test.log(Status.PASS, "V5 pass");
		test.pass("Pass ho gaye ");
		System.out.println("In test 1");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
		if(driver!=null)
			driver.quit();
	}
}
