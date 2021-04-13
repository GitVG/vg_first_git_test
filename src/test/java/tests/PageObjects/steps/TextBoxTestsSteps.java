package tests.PageObjects.steps;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTestsSteps {

    @Test
    void titledataAppear() {
        open("https://www.demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
    }

    @Test
    void dataAppear() {
        String dateOfBirthDay = "6",
                dateOfBirthMonth = "July",
                firstName = "Billy",
                lastName = "Willy",
                dateOfBirthYear = "1988";
        open("https://www.demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue("WB@mail.ru");
        $x("//label[contains(text(),'Male')]").click();
        $x("//input[@id='userNumber']").setValue("1234567890");
        $x("//input[@id='dateOfBirthInput']").click();
        if (dateOfBirthDay.length() == 1) dateOfBirthDay = "0" + dateOfBirthDay;
        $x("//select[@class='react-datepicker__year-select']").selectOption(dateOfBirthYear);
        $x("//select[@class='react-datepicker__month-select']").selectOption(dateOfBirthMonth);
        $x("//div[contains(@class,'react-datepicker__day--0" + dateOfBirthDay + "')]").click();
        $x("//input[@id = 'subjectsInput']").setValue("Eng");
        $x("//*[text()='English']").click();
        $x("//div[contains(@class, 'custom-control-inline')]/label[text() = 'Music']").click();
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/1.jpg");
        $x("//div[@class='col-md-9 col-sm-12']/textarea").setValue("Lorem Ipsum");
        $x("//*[@id='react-select-3-input']").setValue("NC");
        $x("//*[text()='NCR']").click();
        $x("//*[@id='react-select-4-input']").setValue("De");
        $x("//*[text()='Delhi']").click();
        $x("//*[@id='submit']").click(); // Проверка формы
        $x("//td[(text()='Student Name')]").parent().shouldHave(text(firstName + " " + lastName));
        $x("//td[(text()='Student Email')]").parent().shouldHave(text("WB@mail.ru"));
        $x("//td[(text()='Gender')]").parent().shouldHave(text("Male"));
        $x("//td[(text()='Mobile')]").parent().shouldHave(text("1234567890"));
        $x("//td[(text()='Date of Birth')]").parent().shouldHave(text(dateOfBirthDay + " " + dateOfBirthMonth + "," + dateOfBirthYear));
        $x("//td[(text()='Subjects')]").parent().shouldHave(text("English"));
        $x("//td[(text()='Hobbies')]").parent().shouldHave(text("Music"));
        $x("//td[(text()='Picture')]").parent().shouldHave(text("1.jpg"));
        $x("//td[(text()='Address')]").parent().shouldHave(text("Lorem Ipsum"));
        $x("//td[(text()='State and City')]").parent().shouldHave(text("NCR" + " " + "Delhi"));

    }
}