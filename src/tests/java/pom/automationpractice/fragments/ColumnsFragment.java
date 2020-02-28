package pom.automationpractice.fragments;

import org.openqa.selenium.By;
import pom.components.AbstractFragment;

public class ColumnsFragment extends AbstractFragment {
    private By rootElement = By.id("columns");

    public ColumnsFragment() {
        setRootElement(rootElement);
    }
}
