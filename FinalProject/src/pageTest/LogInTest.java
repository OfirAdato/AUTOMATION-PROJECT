package pageTest;

import org.testng.annotations.Test;

import pageObject.MainPage;

public class LogInTest extends BaseTest {

	MainPage mp;

	@Test(description = " log in")
	public void tc_01() {
		mp = new MainPage(driver);
		mp.logIn("ofira2.bibi72@gmail.com", "Ao161198");

	}

}
