package tests.PageObjects.steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StudentRegistrationPage {
    SelenideElement pageHeader = $(".practice-form-wrapper"),
                    firstNameInput = $("#firstName");

    public void checkPageHeader(String value){
        pageHeader.shouldHave(text(value));

    }
    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

        public void setBirthdayDate(String dateOfBirthYear, String dateOfBirthMonth, String dateOfBirthDay) {
            $x("//select[@class='react-datepicker__year-select']").selectOption(dateOfBirthYear);
            $x("//select[@class='react-datepicker__month-select']").selectOption(dateOfBirthMonth);
            $x("//div[contains(@class,'react-datepicker__day--0" + dateOfBirthDay + "')]").click();
        }



}
