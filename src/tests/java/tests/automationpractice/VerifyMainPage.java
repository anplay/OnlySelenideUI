package tests.automationpractice;

import io.qameta.allure.Step;
import pom.automationpractice.fragments.ColumnsFragment;
import pom.automationpractice.fragments.FooterFragment;
import pom.automationpractice.fragments.HeaderFragment;
import pom.automationpractice.pages.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VerifyMainPage {
    MainPage mainPage;
    FooterFragment footerFragment;
    HeaderFragment headerFragment;
    ColumnsFragment columnsFragment;

    @BeforeMethod
    public void setUpClass() {
        mainPage = new MainPage();
        footerFragment = new FooterFragment();
        headerFragment = new HeaderFragment();
        columnsFragment = new ColumnsFragment();
    }

    @Test
    public void verifyMainPage() {
        mainPage.visit();

        assertThat(headerFragment.isVisible()).isTrue();
        assertThat(columnsFragment.isVisible()).isTrue();
        assertThat(footerFragment.isVisible()).isTrue();

    }

}
