package tests;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.logic.TabulatorMainPageLogic;
import tests.base.BaseTest;

public class TabulatorMainPageTest extends BaseTest {

    @BeforeClass
    protected void goTo(){
        DriverManager.currentDriver().get("http://tabulator.info/examples/4.0?#ajax");
    }

    @Test
    public void tabulatorMainPage(){
        TabulatorMainPageLogic tabulatorMainPageLogic = new TabulatorMainPageLogic();

        tabulatorMainPageLogic.get().getLoadDataViaAJAXButton().click();

        new WebDriverWait(DriverManager.currentDriver(), 10)
                .until(ExpectedConditions.visibilityOfAllElements(tabulatorMainPageLogic.get().getRowsOfTableAJAX() ));

        Assert.assertNotEquals(tabulatorMainPageLogic.containsName("Brendon Philips"), false);
    }

}
