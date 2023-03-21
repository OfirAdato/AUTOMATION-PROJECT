//package pageTest;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageObject.MainPage;
//import pageObject.Task1;
//
//public class PageTest2 extends BaseTest {
//	MainPage mp;
//	Task1 t1;
//
//	@Test(description = " delete row task")
//	public void tc_01() {
//
//		mp = new MainPage(driver);
//		mp.deleteRowTask("ofir task");
//		mp.deleteRowTask("ofir task");
//		mp.deleteRowTask("ofir task");
//		mp.deleteRowTask("ofir task 2");
//
//	}
//
//	//@Test(description = "add row task")
////	public void tc_02() {
////		mp.addRowTask("ofir task");
////		mp.addSimpleTaskOK();
//
//	//}
//
//	//@Test(description = "find row task")
////	public void tc_03() {
////		mp.findTask("ofir task");
////	}
//
//	@Test(description = "add new task")
//	public void tc_04() {
//		t1 = new Task1(driver);
//		t1.addSimpleTask("ofir test");
//		t1.addNewTask();
//		t1.dateNote("28/01/23");
//		t1.priorityTask("1");
//		t1.addTaskField("this is my first task");
//		t1.fillNote("here you can write your note");
//		t1.fillTags("automation");
//		t1.saveTask();
//
//	}
//
//	@Test(description = "search task")
//	public void tc_05() {
//		mp.searchTask("first");
//		mp.numOfTask();
//	}
//
////	@Test(description = "add row task")
////	public void tc_06() {
////		int before = mp.number();
////		mp.addRowTask("ofir task 2");
////		mp.addSimpleTaskOK();
////		int after = mp.number();
////		Assert.assertEquals(after, before);
////	}
//
////	@Test(description = "find row task")
////	public void tc_07() {
////		mp.findTask("ofir task 2");
////
////	}
//
//	@Test(description = "add new task")
//	public void tc_08() {
//		t1 = new Task1(driver);
//		t1.addSimpleTask("ofir test");
//		t1.addNewTask();
//		t1.addmishTask();
//		t1.dateNote("28/01/23");
//		t1.priorityTask("2");
//		t1.addTaskField("this is my secnode task");
//		t1.fillNote("here you can write your note");
//		t1.fillTags("menual");
//		t1.saveTask();
//
//	}
//
//	@Test(description = "add new task")
//	public void tc_09() {
//		t1 = new Task1(driver);
//		t1.addSimpleTask("ofir test2");
//		t1.addNewTask();
//		t1.addmishTask();
//		t1.dateNote("28/01/23");
//		t1.priorityTask("2");
//		t1.addTaskField("this is my secnode task");
//		t1.fillNote("here you can write your note");
//		t1.fillTags("menual");
//		t1.saveTask();
//
//	}
//
//	@Test(description = "add new task")
//	public void tc_10() {
//		mp.deleteTask("this is my secnode task");
//
//	}
//
//	@Test(description = "search task")
//	public void tc_11() {
//		mp.searchTask("first");
//		mp.numOfTask();
//	}
//
//}
