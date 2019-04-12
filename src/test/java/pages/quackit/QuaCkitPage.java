package pages.quackit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class QuaCkitPage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'btn-secondary') and contains(text(), 'Preview')]")
    private WebElement previewButton;

    public QuaCkitPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPreviewButton() {
        return previewButton;
    }
}
