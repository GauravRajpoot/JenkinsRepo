package com.nagarro.com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.v3.ExtentManagerv3;
import utils.v2.ExtentTestManager;
@Listeners(com.nagarro.listners.TestListenerv3.class)
public class Jenkins  {
	public static WebDriver driver ;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(driver);
	}
	
	@Test()
	public void Seleniumtest1() {
//		ExtentManagerv3.getInstance()
//		ExtentTestManager.startTest("Seleniumtest1", "Starting demo report");
//		ExtentTest ex1=ExtentTestManager.getTest().createNode("Trying first Node in First scenarios");
//		ex1.log(Status.PASS, "First node created testcase");
		System.out.println("In test 1");
//		ex1.log(Status.PASS, "First testcase for google");
		driver.get("http://google.com");
		
	}

	
//	@Test()
//	public void Seleniumtest1() {
//		ExtentTestManager.startTest("Seleniumtest1", "Starting demo report");
//		ExtentTest ex1=ExtentTestManager.getTest().createNode("Trying first Node in First scenarios");
//		ex1.log(Status.PASS, "First node created testcase");
//		System.out.println("In test 1");
//		ex1.log(Status.PASS, "First testcase for google");
//		driver.get("http://google.com");
//		Assert.fail();
//		ExtentTest ex2=ExtentTestManager.getTest().createNode("Trying second Node in First scenarios");
//		ex2.log(Status.PASS, "Second node created testcase");
//		
//	}
//	
//	@Test 
//	public void Seleniumtest2() {
//		ExtentTestManager.startTest("Seleniumtest1", "Starting second demo report");
//		ExtentTest ex1=ExtentTestManager.getTest().createNode("Trying first Node in Second scenarios");
//		ex1.log(Status.PASS, "First node created testcase");
//		System.out.println("In test 2");
//		ExtentTestManager.getTest().log(Status.PASS, "Second testcase");
//		driver.get("https://www.amazon.com");
//		ExtentTest ex2=ExtentTestManager.getTest().createNode("Trying second Node in Second scenarios");
//		ex2.log(Status.PASS, "Second node created testcase");
//	}
//	
//	@Test
//	public void Seleniumtest3() {
//		ExtentTestManager.startTest("Seleniumtest1", "Starting third demo report");
//		ExtentTest ex1=ExtentTestManager.getTest().createNode("Trying first Node in third scenarios");
//		ex1.log(Status.PASS, "First node created testcase");
//		System.out.println("In test 3");
//		ExtentTestManager.getTest().log(Status.PASS, "Third testcase");
//		driver.get("https://www.flipkart.com/");
//		ExtentTest ex2=ExtentTestManager.getTest().createNode("Trying second Node in Third scenarios");
//		ex2.log(Status.PASS, "Second node created testcase");
//	}

	@AfterClass
	public void tearDown() {
		if(driver!=null)
			driver.quit();
	}
}
