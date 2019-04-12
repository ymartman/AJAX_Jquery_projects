package pages.quackit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import tests.base.BaseTest;

import java.util.List;

public class PreviewPage  extends BasePage {

    @FindBy(xpath = "//div[@class='file']")
    private WebElement fileButton;

    @FindBy(xpath = "//div[@class='folder']")
    private WebElement folderPanel;

    @FindBy(xpath = "//div[@class='folder']/div")
    private List<WebElement> listOfFles;

    public PreviewPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFileButton() {
        return fileButton;
    }

    public WebElement getFolderPanel() {
        return folderPanel;
    }

    public List<WebElement> getListOfFles() {
        return listOfFles;
    }
}
