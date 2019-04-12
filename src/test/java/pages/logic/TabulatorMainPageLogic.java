package pages.logic;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TabulatorMainPage;

public class TabulatorMainPageLogic {

    TabulatorMainPage tabulatorMainPage = new TabulatorMainPage(DriverManager.currentDriver());

    public TabulatorMainPage get(){
        return this.tabulatorMainPage;
    }

    public boolean containsName(String information){
        boolean flag = false;
        for (WebElement element : tabulatorMainPage.getRowsOfTableAJAX()){
            if (element.findElement(By.xpath("./div[@tabulator-field='name']")).getText()
                        .trim()
                        .toLowerCase()
                    .equals(information
                        .trim()
                        .toLowerCase())){
                flag = true;
                break;

            }
        }
        return flag;
    }

}
