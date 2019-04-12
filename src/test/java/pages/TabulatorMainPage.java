package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class TabulatorMainPage extends BasePage {

    @FindBy(id = "ajax-trigger")
    private WebElement loadDataViaAJAXButton;

    @FindBy(id = "example-table-ajax")
    private WebElement tableAJAX;

    @FindBy(xpath = "//div[@id='example-table-ajax']/div/div[@class='tabulator-table']/div")
    private List<WebElement> rowsOfTableAJAX;

    public TabulatorMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoadDataViaAJAXButton() {
        return loadDataViaAJAXButton;
    }

    public WebElement getTableAJAX() {
        return tableAJAX;
    }

    public List<WebElement> getRowsOfTableAJAX() {
        return rowsOfTableAJAX;
    }

}
