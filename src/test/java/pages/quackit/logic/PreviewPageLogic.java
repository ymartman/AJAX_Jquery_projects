package pages.quackit.logic;

import driver.DriverManager;
import org.openqa.selenium.By;
import pages.quackit.PreviewPage;

public class PreviewPageLogic {
    PreviewPage previewPage = new PreviewPage(DriverManager.currentDriver());

    public PreviewPage get(){
        return this.previewPage;
    }

    public void fileButtonClick(){
        this.previewPage.getFileButton().click();
    }

    public int contains(){
        return this.get().getFolderPanel().findElements(By.xpath("./div[@class='file']")).size();
    }

}
