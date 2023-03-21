package pageTest;

import org.testng.annotations.Test;

import pageObject.Job1;
import pageObject.LoveJobs;
import pageObject.MainPage;

public class SearchFunction extends BaseTest {

	MainPage mp;
	Job1 J1;
	LoveJobs lj;

	@Test(description = " log in")
	public void login() {
		mp = new MainPage(driver);
		mp.logIn("ofira2.bibi72@gmail.com", "Ao161198");

	}

	@Test(description = "search function")
	public void tc_01() {
		mp = new MainPage(driver);
		mp.searchJob("qa tester", "מ", "10");

	}
 
	@Test(description = "choose filter")
	public void tc_02() {
		J1 = new Job1(driver);
		J1.Category();
		J1.Domain();
		J1.Area("מרכז", "תל אביב");
		J1.Years();
		J1.jobType();

	}

	@Test(description = "choose job")
	public void tc_03() {
		J1.chooseJob("בדיקות אוטומטיות");

	}

	@Test(description = "get love")
	public void tc_04() {
		lj = new LoveJobs(driver);
		lj.loveJobs();
		lj.allloveJobs();
		
	}
	
	@Test(description = "send cv")
	public void tc_05() {
		lj.sendCV("במסגרת פרויקט אוטומציה כתבתי קוד ותשתית אוטומציה מלאה ששלחה אליכם את קורות החיים שלי. אני עובד כיום כבודק תוכנה ידני והייתי שמח לעבור לתחום האוטומציה, אם התרשמת ממכתב זה, אשמח שתיצרו איתי קשר. ");
		
	}
	
	@Test(description = "log out")
	public void tc_06() {
		lj.logout();
		
	}
	

}
