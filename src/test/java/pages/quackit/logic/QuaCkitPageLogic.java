package pages.quackit.logic;

import driver.DriverManager;
import pages.quackit.PreviewPage;
import pages.quackit.QuaCkitPage;

public class QuaCkitPageLogic {

    QuaCkitPage quaCkitPage = new QuaCkitPage(DriverManager.currentDriver());

    public QuaCkitPage get(){
        return this.quaCkitPage;
    }

    public void previewClick(){
        get().getPreviewButton().click();
    }

}
