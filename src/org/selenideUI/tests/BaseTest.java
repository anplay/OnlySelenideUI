package org.selenideUI.tests;

import org.selenideUI.utils.Service;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		Service.getInstance().initDriver();
	}
}
