package Steps;

import PageObjects.LoginSerenityPageObjects;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LoginSerenitySteps {

    LoginSerenityPageObjects loginSerenityPageObjects = new LoginSerenityPageObjects();

    @Step
    public void abrirNavegador() {
        loginSerenityPageObjects.open();
    }

    @Step
    public void enterUser() {
        loginSerenityPageObjects.getDriver().findElement(loginSerenityPageObjects.getLlbUserName()).clear();
        loginSerenityPageObjects.getDriver().findElement(loginSerenityPageObjects.getLlbUserName()).sendKeys("admin");
    }

    @Step
    public void enterPassword() {
        loginSerenityPageObjects.getDriver().findElement(loginSerenityPageObjects.getLlbPassword()).clear();
        loginSerenityPageObjects.getDriver().findElement(loginSerenityPageObjects.getLlbPassword()).sendKeys("serenity");
    }

    @Step
    public void clickOnLogin() {
        loginSerenityPageObjects.getDriver().findElement(loginSerenityPageObjects.getBtnLogin()).click();
    }

    @Step
    public void validateText() {

        String txtValidate = loginSerenityPageObjects.getDriver().findElement(loginSerenityPageObjects.getLlbtext()).getText();
        System.out.println(txtValidate);
        assertThat(txtValidate, containsString("Dash"));
    }
}
