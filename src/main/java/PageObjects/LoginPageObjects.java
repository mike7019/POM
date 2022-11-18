package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/automation-practice-form")
public class LoginPageObjects extends PageObject {


    By llbFirstName = By.cssSelector("#firstName");
    By txtLastName = By.cssSelector("#lastName");
    By txtEmail = By.cssSelector("#userEmail");
    By rdoButtons = By.cssSelector("label[for='gender-radio-1']");
    By txtMobile = By.cssSelector("#userNumber");
    By txtDate = By.cssSelector("#dateOfBirthInput");
    By txtMonth = By.cssSelector(".react-datepicker__month-select");
    By txtYear = By.cssSelector(".react-datepicker__year-select");
    By lstDay = By.xpath("");
    By chkHobbies = By.cssSelector("label[for='hobbies-checkbox-2']");
    By btnSel_Pic = By.cssSelector("#uploadPicture");
    By txtCurrentAdd = By.cssSelector("#currentAddress");
    By lstState = By.xpath("//*[@class=' css-1wa3eu0-placeholder' and contains(.,'Select State')]");
    By lstCity = By.xpath("//*[@class=' css-1wa3eu0-placeholder' and contains(.,'Select City')]");
    By lblThanks = By.cssSelector("#example-modal-sizes-title-lg");
    By btnSubmit = By.cssSelector("#submit");




    public By getLlbFirstName() {
        return llbFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getRdoButtons() {
        return rdoButtons;
    }

    public By getTxtMobile() {
        return txtMobile;
    }

    public By getTxtDate() {
        return txtDate;
    }

    public By getTxtMonth() {return txtMonth;}

    public By getTxtYear() {return txtYear;}

    public By getLstDay() {
        return lstDay;
    }

    public By getChkHobbies() {
        return chkHobbies;
    }

    public By getBtnSel_Pic() {
        return btnSel_Pic;
    }

    public By getTxtCurrentAdd() {
        return txtCurrentAdd;
    }

    public By getLstState() {
        return lstState;
    }

    public By getLstCity() {
        return lstCity;
    }

    public By getLblThanks() {
        return lblThanks;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }
}
