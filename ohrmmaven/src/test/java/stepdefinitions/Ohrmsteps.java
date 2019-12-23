package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ohrmsteps {
public WebDriver driver;
	@Given("^I open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String url)  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}

	@Then("^I should see Login Page$")
	public void i_should_see_Login_Page()  {
	    if(driver.findElement(By.id("btnLogin")).isDisplayed())
	    {
	System.out.println("Application Opened Successfully");
	
	    }else{
	    	System.out.println("app launch failed");
	    }}
	    

	@When("^I Enter username as \"([^\"]*)\"$")
	public void i_Enter_username_as(String uname) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}

	@When("^I Enter password as \"([^\"]*)\"$")
	public void i_Enter_password_as(String pword)  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("txtPassword")).sendKeys(pword);
	}

	@When("^I click Login$")
	public void i_click_Login() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^I should see Admin Module$")
	public void i_should_see_Admin_Module()  {
	    // Write code here that turns the phrase above into concrete actions
	   if(driver.findElement(By.linkText("Admin")).isDisplayed()){
		   System.out.println("Admin Login Successfully");
	   }else{
		   System.out.println("admin login failed");
	   }
	}

	@When("^I close browser$")
	public void i_close_browser()  {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}
		@Then("^I should See Error Message$")
		public void i_should_See_Error_Message() {
		    // Write code here that turns the phrase above into concrete actions

		    String errmsg=driver.findElement(By.id("spanMessage")).getText();
		    if(errmsg.toLowerCase().contains("invalid")){
				System.out.println("Admin Login Test Pass With invalid data");
				
			}else{
				System.out.println("Admin Login test fail with Invalid Login");
			}
		}
	}
	
	

