package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	JavascriptExecutor js;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillText(WebElement el, String text) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background-color:yellow;','border: 1px solid blue;');",
				el);
		waiting(200);
		clear(el);
		el.sendKeys(text);
	}

	public void clear(WebElement el) {
		el.clear();

	}

	public void click(WebElement el) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background-color:yellow;','border: 1px solid blue;');",
				el);
		waiting(200);
		el.click();
	}

	public String getText(WebElement el) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background-color:red;','border: 1px solid black;');", el);
		waiting(200);
		return el.getText();

	}

	// Select
	public void selectByValue(WebElement el, String text) {
		Select s = new Select(el);
		s.selectByValue(text);
	}

	public void waiting(long mill) {
		try {
			Thread.sleep(mill);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void waitUntil(long sec, WebElement el) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background-color:yellow;','border: 1px solid blue;');",
				el);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(el));
		click(el);
	}

	public void quit() {
		driver.quit();
	}
}
