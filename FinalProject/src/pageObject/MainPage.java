package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends SharedPage {

	@FindBy(css = ".mb-md-0.px-1.pt-0.col-sm-5.col-12 .v-input__control>.v-input__slot.white>.v-select__slot>input[type^=text]")
	private WebElement fillFunction;

	@FindBy(css = ".py-0.px-1.mt-sm-0.auto-suggest-top.col-sm-5.col-12.mt-3 .v-input__control>.v-input__slot.white>.v-select__slot>input[type^=text]")
	private WebElement fillArea;

	@FindBy(css = "	#distance-select .v-input__control .v-select__slot .v-input__append-inner")
	private WebElement distanceBtn;

	@FindBy(css = "div.mt-sm-0.d-flex.px-1.col-sm-2.col-12.align-self-center.mt-3>div>button>span")
	private WebElement clickSearch;

	@FindBy(css = "#btnDeleteList")
	private WebElement deleteBtn;

	@FindBy(css = "#btnModalOk")
	private WebElement deleteOKBtn;

	@FindBy(css = ".mtt-searchbox>#search")
	private WebElement searchBtn;

	@FindBy(css = ".v-menu__content.theme--light.menuable__content__active .v-list-item__content")
	private List<WebElement> distanceList;

	@FindBy(css = ".v-menu__content.theme--light.menuable__content__active.v-autocomplete__content.autosuggest-menu .v-list-item__content")
	private List<WebElement> areaList;

	public MainPage(WebDriver driver) {
		super(driver);

	}

	public void searchJob(String function, String area, String distance) {
		waiting(500);
		fillText(fillFunction, function);
		fillText(fillArea, area);
		waiting(1000);
		for (WebElement el : areaList) {
			WebElement areaTitle = el.findElement(
					By.cssSelector(".v-menu__content.theme--light.menuable__content__active.v-autocomplete__content.autosuggest-menu .v-list-item__content>.v-list-item__title"));
			if (getText(areaTitle).contains(area)) {
				click(areaTitle);
				break;
			} 
		}
		waiting(1000);	
		chooseDistance(distance);
		click(clickSearch);

	}

	public void chooseDistance(String distance) {

		click(distanceBtn);
		for (WebElement el : distanceList) {
			WebElement taskTitle = el.findElement(By.cssSelector(
					".v-menu__content.theme--light.menuable__content__active .v-list-item__content>.v-list-item__title"));
			click(distanceList.get(0));
			click(distanceBtn);
			if (getText(taskTitle).contains(distance)) {
				click(taskTitle);
				break;
			}
		}

	}

}
