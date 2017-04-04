package org.selenideUI.tests.Google;

import org.selenideUI.pom.google.fragments.SearchFragment;
import org.selenideUI.pom.google.pages.GoogleMainPage;
import org.selenideUI.tests.BaseTest;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTest {
	@Test
	public void test() {
		new GoogleMainPage().visit();
		new SearchFragment().doSearch("Selenide");
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
