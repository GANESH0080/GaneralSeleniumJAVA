package StepsDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	WebDriver driver;

	

	@When("^Tittle Of Login Page Is Login$")
	public void Tittle_Of_The_Login_Page_Is_Login() {
		String ActTittle = driver.getTitle();
		System.out.println("Tittle of the Page is" + " " + ActTittle);
		Assert.assertEquals("Login", ActTittle);
	}

	@Then("^Agent Entering \"(.*)\" and \"(.*)\"$")
	public void Agent_Entering_Username_and_Password(String username, String password) {
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Click Login Button$")
	public void click_on_Login_Button() {
		driver.findElement(By.id("btnSubmit")).click();
	}

	@When("^URL Of LoggedIn Page$")
	public void URL_Of_The_LoggedIn_Page() {

		String CurrentURL = driver.getCurrentUrl();
		System.out.println("LoggedIn URL" + " " + CurrentURL);
		Assert.assertEquals(CurrentURL, "https://test.cogitate.us/PPE.HO3/Home");

	}

	@Then("^Click GuidLines Link$")
	public void Click_On_GuidLines_Link() throws InterruptedException {
		driver.findElement(By.id("btnRenewalInstructions")).click();
	}
	@Given("^Agent Already On Login Page$")
	public void Agent_Is_Already_On_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.cogitate.us/PPE.HO3/");

	}
}
