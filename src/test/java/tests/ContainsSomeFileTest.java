package tests;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.quackit.QuaCkitPage;
import pages.quackit.logic.PreviewPageLogic;
import pages.quackit.logic.QuaCkitPageLogic;
import tests.base.BaseTest;

public class ContainsSomeFileTest extends BaseTest {

    @BeforeClass
    public void goTo(){
        DriverManager.currentDriver().get("https://www.quackit.com/html/html_editors/scratchpad/?example=/jquery/examples/jquery_add_content_clone_and_prependto");
    }

    @Test
    public void containsSomeFile(){
        QuaCkitPageLogic quaCkitPageLogic = new QuaCkitPageLogic();
        quaCkitPageLogic.previewClick();

        for (String tab : DriverManager.currentDriver().getWindowHandles()){
            DriverManager.currentDriver().switchTo().window(tab);
        }

        PreviewPageLogic previewPageLogic = new PreviewPageLogic();

        int random = 10 + (int) (Math.random() * 10);

        for (int i = 0; i < random; i++){
            previewPageLogic.fileButtonClick();
            new WebDriverWait(DriverManager.currentDriver(), 10)
                    .until(ExpectedConditions.visibilityOfAllElements(previewPageLogic.get().getListOfFles()));
        }

        Assert.assertNotEquals(previewPageLogic.contains() == random, false);
    }

}
