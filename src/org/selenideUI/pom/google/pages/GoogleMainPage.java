package org.selenideUI.pom.google.pages;

import static com.codeborne.selenide.Selenide.$;
import static org.selenideUI.pom.components.WebComponentFactory.createFragment;

import org.selenideUI.pom.components.AbstractSitePage;
import org.selenideUI.pom.google.fragments.SearchFragment;


public class GoogleMainPage extends AbstractSitePage {

	private final static String PAGE_NAME = "Google";
	private final static String PATH = "/";
	private final static String BODY_CLASS = "vasq";

	public GoogleMainPage() {
		setPageUrl(PATH);
		setPageName(PAGE_NAME);
		setBodyClass(BODY_CLASS);
	}

	public SearchFragment getSearchFragment() {
		return createFragment(SearchFragment.class);
	}
}
