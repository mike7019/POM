package Steps;


import PageObjects.LoginPageObjects;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;


public class LoginSteps {

    LoginPageObjects loginPageObject = new LoginPageObjects();

    @Step
    public void abrirNavegador() {
        loginPageObject.open();
    }

    @Step
    public void enterFirstName() {
        loginPageObject.getDriver().findElement(loginPageObject.getLlbFirstName()).sendKeys("Michael");
    }

    @Step
    public void enterLastName() {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtLastName()).sendKeys("Garzon Rodriguez");
    }

    @Step
    public void enterEmail() {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtEmail()).sendKeys("amph7019@gmail.com");
    }

    @Step
    public void selMale() {
        loginPageObject.getDriver().findElement(loginPageObject.getRdoButtons()).click();
    }


    @Step
    public void enterPhone() {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtMobile()).sendKeys("3043261092");

    }

    @Step
    public void clickBDate() {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtDate()).click();
    }

    @Step
    public void enterBDate() {
        loginPageObject.waitFor(".react-datepicker__month-select");
        loginPageObject.getDriver().findElement(loginPageObject.getTxtMonth()).click();
        loginPageObject.getDriver().findElement(loginPageObject.getTxtMonth()).sendKeys("June");
    }

    @Step
    public void enterYear() {
        loginPageObject.waitFor(".react-datepicker__year-select");
        loginPageObject.getDriver().findElement(loginPageObject.getTxtYear()).click();
        loginPageObject.getDriver().findElement(loginPageObject.getTxtYear()).sendKeys("2012");

    }

    public void enterDay() {

        loginPageObject.getDriver().findElement(loginPageObject.getLstDay()).click();


    }

    @Step
    public void chkHobbieSport() {
        loginPageObject.getDriver().findElement(loginPageObject.getChkHobbies()).click();
    }

    @Step
    public void chooseFile() {
        WebElement chooseFile = loginPageObject.getDriver().findElement(loginPageObject.getBtnSel_Pic());
        chooseFile.sendKeys("D:\\Multimedia\\buceo\\1.jpg");
    }

    @Step
    public void enterCurrentAdd() {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtCurrentAdd()).sendKeys("cra 16 b # 7-14");
    }

    @Step
    public void selState() {
        //loginPageObject.getDriver().findElement(loginPageObject.getLstState()).click();
        loginPageObject.getDriver().findElement(loginPageObject.getLstState()).sendKeys(Keys.ENTER);

        loginPageObject.waitFor("//*[@class=' css-1wa3eu0-placeholder' and contains(.,'Select City')]");
    }

    @Step

    public void selCity() {
        loginPageObject.waitFor("//*[@class=' css-1wa3eu0-placeholder' and contains(.,'Select City')]");
        loginPageObject.getDriver().findElement(loginPageObject.getLstCity()).click();

    }

    @Step
    public void submit() {
        loginPageObject.getDriver().findElement(loginPageObject.getBtnSubmit()).click();
    }


    @Step
    public void validarUsuario() {

        String txtWelcome = loginPageObject.getDriver().findElement(loginPageObject.getLblThanks()).getText();
        System.out.println(txtWelcome);
        assertThat(txtWelcome.contains("Thanks"), Matchers.is(true));

    }


}
