package tests.PageObjects.scenarios;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTestsSteps {
   /* StudentRegistrationPage studentRegistrationPage;
    @Test
    void titledataAppear() {
        open("https://www.demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
    }

    @Test
    void dataAppear() {
        studentRegistrationPage = new StudentRegistrationPage();
        String dateOfBirthDay = "6",
                dateOfBirthMonth = "July",
                firstName = "Billy",
                lastName = "Willy",
                dateOfBirthYear = "1988";
        open("https://www.demoqa.com/automation-practice-form");
        studentRegistrationPage.fillForm();
       studentRegistrationPage.checkData();
        // Проверка формы
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

    } */
}