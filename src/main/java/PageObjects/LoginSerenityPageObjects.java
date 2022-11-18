package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/")
public class LoginSerenityPageObjects extends PageObject {

    By llbUserName = By.xpath("//input[@id='LoginPanel0_Username']");
    By llbPassword = By.xpath("//input[@id='LoginPanel0_Password']");
    By btnLogin = By.xpath("//button[@id='LoginPanel0_LoginButton']");
    By llbtext = By.xpath("//h1[contains(text(),'Dashboard')]");

    public By getLlbUserName() {
        return llbUserName;
    }

    public By getLlbPassword() {
        return llbPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getLlbtext() {
        return llbtext;
    }
}
