package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoveJobs extends SharedPage {

	public LoveJobs(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".v-form.px-2 .v-input--selection-controls__input .v-input--selection-controls__ripple")
	private WebElement allLoved;

	@FindBy(css = ".layout.mb-4 .v-btn__content")
	private WebElement sendcvBtn;

	@FindBy(css = ".primary--text.display-24.pointer")
	private WebElement addletterBtn;
	
	@FindBy(css = ".v-input.v-textarea.theme--light.v-text-field.v-text-field--single-line.v-text-field--solo.v-text-field--is-booted.v-text-field--enclosed.v-text-field--placeholder .v-text-field__slot>textarea")
	private WebElement letterfield;
	
	@FindBy(css = ".orange_btn_narrow.v-btn.v-btn--contained.theme--light.v-size--default>.v-btn__content")
	private WebElement sendCV;
	
	@FindBy(css = ".display-24.mr-3.mb-3.underline")
	private WebElement msg;
	
	@FindBy(css = "#app > div.v-dialog__content > div > div > div > div > div.flex.text-left.x-close > button > span > i")
	private WebElement outMsg;

	public void allloveJobs() {

		waitUntil(5, allLoved);
	}

	public void sendCV(String text) {
		waitUntil(5,sendcvBtn);
		waitUntil(5,addletterBtn);
		fillText(letterfield, text);
		waitUntil(5, sendCV);
		System.out.println(getText(msg));
		click(outMsg);
	}

}
