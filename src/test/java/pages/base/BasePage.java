package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Зачем он нужен? Если у тебя конструктор всё равно везде переписывается
//Зачем передавать в конструктор драйвер?
public class BasePage {

    protected BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
