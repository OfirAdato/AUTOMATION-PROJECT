package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Job1 extends SharedPage {

	public Job1(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "#filters .v-btn__content")
	private List<WebElement> filterList;

	@FindBy(css = ".v-treeview-node__label")
	private List<WebElement> areaList;

	@FindBy(css = ".v-treeview-node__children .v-treeview-node__root")
	private List<WebElement> cityList;

	@FindBy(css = ".flex.job")
	private List<WebElement> jobList;

	@FindBy(css = "#scrollbar-box > ul > li:nth-child(2) > a")
	private WebElement categoryBtn;

	@FindBy(css = "#scrollbar-box > ul > li:nth-child(4) > div > div > div > div > div")
	private WebElement domainBtn;

	@FindBy(css = ".taskbox-c a")
	private WebElement areaBtn;

	@FindBy(css = ".form-row>.in500.form-input")
	private WebElement yearsBtn;

	@FindBy(css = "#newtask_form [name='task']")
	private WebElement jobType;

	@FindBy(css = "#app > div.v-dialog__content.v-dialog__content--active > div > div > div.layout.drop-footer > div.flex.drop-footer-btn > div > button > span")
	private WebElement saveBtn;

	@FindBy(css = "#scrollbar-box > ul > li:nth-child(1) > div > div > div > div > div[class=\"v-input--selection-controls__ripple\"]")
	private WebElement yearsExp;

	@FindBy(css = ".v-dialog.v-dialog--active .dr-btn-wrapper>.v-btn.v-btn--contained.theme--light.v-size--default.orange_btn_search.text-center")
	private WebElement saveYear;

	@FindBy(css = "#scrollbar-box > ul > li:nth-child(1) > div > div > div > div > div[class=\"v-input--selection-controls__ripple\"]")
	private WebElement typeBtn;

	@FindBy(css = "#app > div.v-dialog__content.v-dialog__content--active > div > div > div.layout.drop-footer > div.flex.drop-footer-btn > div")
	private WebElement saveType;

	@FindBy(css = "#app > div.v-application--wrap > div:nth-child(3) > div.container.jobs-wrap > div.section_inner > div.layout.column > div > div > div.flex.jobs-row.sm12.md8.lg10 > div:nth-child(2) > div:nth-child(1) > div > div > div.layout.job-details-box.vacancyFullDetails.wrap > div.layout.column.px-4 > div.layout.column > form > div > div > div > div > div > div")
	private WebElement validBtn;

	@FindBy(css = ".v-icon.notranslate.ma-0.v-icon--right.material-icons.theme--light.primary--text.icon-like")
	private WebElement likeBtn;

	// בחירת סינון של קטגוריה

	public void Category() {

		waitUntil(5, filterList.get(0));
		waitUntil(5, categoryBtn);
		waiting(1000);

	}
	// בחירת סינון של תחום

	public void Domain() {
		waitUntil(5, filterList.get(1));
		waitUntil(10, domainBtn);
		waitUntil(5, saveBtn);

	}
	// בחירת סינון של אזור

	public void Area(String areaName, String cityName) {
		click(filterList.get(2));
		waiting(500);
		for (WebElement el : areaList) {
			WebElement areaTitle = el.findElement(By.cssSelector(".v-treeview-node__label>.filter-link"));
			waiting(500);
			if (getText(areaTitle).contains(areaName)) {
				waitUntil(5, areaTitle);
				break;
			}
		}
		waiting(500);
		for (WebElement el : cityList) {
			WebElement cityTitle = el.findElement(
					By.cssSelector(".v-treeview-node__children .v-treeview-node__root .v-treeview-node__label>a"));
			if (getText(cityTitle).equalsIgnoreCase(cityName)) {
				waitUntil(5, cityTitle);
				break;
			}
		}

	}
	// בחירת סינון של שנות ניסיון

	public void Years() {

		waitUntil(5, filterList.get(3));
		waitUntil(5, yearsExp);
		waitUntil(5, saveYear);

	}
	// בחירת סינון של היקף משרה

	public void jobType() {
		waitUntil(5, filterList.get(4));
		waitUntil(5, typeBtn);
		waitUntil(5, saveType);

	}
	// בחירת משרה לאחר סינון

	public void chooseJob(String job) {
		for (WebElement el : jobList) {
			WebElement filedJob = el.findElement(By.cssSelector(".display-18.view-on-submit"));
			waiting(500);
			if (getText(filedJob).contains(job)) {
				waitUntil(5, filedJob);
				//waitUntil(5, validBtn);
				waitUntil(5, likeBtn);
				break;
			}

		}

	}

	// public void fillTags(String tags) {
	// fillText(tagsFiled, tags);
	// }

	// public void saveTask() {
	// click(saveTask);
	// ;
	// }
	//
	// public void cancleTask() {
	// click(cancleTask);
	// ;
	// }

}