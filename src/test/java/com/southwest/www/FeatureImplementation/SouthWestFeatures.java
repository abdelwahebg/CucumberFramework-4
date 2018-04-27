package com.southwest.www.FeatureImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.southwest.www.Pages.EnrollmentPage;
import com.southwest.www.Pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SouthWestFeatures {
	
	WebDriver oBrowser;
	
	@Given("^Application should be launched$")
	public void application_should_be_launched() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		oBrowser = new ChromeDriver();
		
		//2. Launch https://www.southwest.com	
		oBrowser.get("https://www.southwest.com");
		
		oBrowser.manage().window().maximize();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //throw new PendingException();
	}

	@When("^User clicks Enroll link on Home Screen$")
	public void user_clicks_Enroll_link_on_Home_Screen() throws Throwable {
		HomePage oHomePage = PageFactory.initElements(oBrowser, HomePage.class);
		
		oHomePage.clickEnroll();
	    //throw new PendingException();
	}

	@When("^Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String arg1, String arg2) throws Throwable {
		EnrollmentPage oEnrollmentPage = PageFactory.initElements(oBrowser, EnrollmentPage.class);
		
		oEnrollmentPage.enrollment(arg1, arg2);
	    //throw new PendingException();
	}
	
	@When("^Enters First Name and Last Name$")
	public void enters_First_Name_and_Last_Name() throws Throwable {
		EnrollmentPage oEnrollmentPage = PageFactory.initElements(oBrowser, EnrollmentPage.class);
		
		oEnrollmentPage.enrollment();
	    //throw new PendingException();
	}

	@Then("^Aplication should be closed$")
	public void aplication_should_be_losed() throws Throwable {
		oBrowser.quit();
	   // throw new PendingException();
	}

}
