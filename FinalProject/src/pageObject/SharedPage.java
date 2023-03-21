package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedPage extends BasePage {

	public SharedPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(css = ".flex.sm4.pa-0")
	private WebElement logIn;

	@FindBy(css = "#email-login-field")
	private WebElement emailField;

	@FindBy(css = "#password-login-field")
	private WebElement passField;

	@FindBy(css = "#submit-login-btn")
	private WebElement connectBtn;

	@FindBy(css = ".favorites-jobs-btn.d-block")
	private WebElement loveBtn;
	
	@FindBy(css = "#logout-btn")
	private WebElement logoutBtn;

	public void logIn(String email, String password) {

		waiting(1000);
		click(logIn);
		waiting(500);
		fillText(emailField, email);
		waiting(500);
		fillText(passField, password);
		waiting(500);
		click(connectBtn);
	}

	public void loveJobs() {

		waitUntil(10, loveBtn);
	
	}
	
	public void logout() {

		waiting(1000);
		click(logIn);	
		waitUntil(2,logoutBtn);
	}
}
