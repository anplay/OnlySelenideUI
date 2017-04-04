package org.selenideUI.pom.google.fragments;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.selenideUI.pom.components.AbstractFragment;


public class SearchFragment extends AbstractFragment {

	private By rootElement = By.id("sfdiv");
	private By searchField = By.name("q");

	public SearchFragment() {
		setRootElement(rootElement);
	}

	public void doSearch(String searchQuery) {
		$(searchField).setValue(searchQuery).pressEnter();
	}
}
