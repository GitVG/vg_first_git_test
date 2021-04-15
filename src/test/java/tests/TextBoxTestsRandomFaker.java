package tests;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValues;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static utils.RandomUtils.*;

public class TextBoxTestsRandomFaker {
    Faker faker = new Faker();
    // FakerValuesService fakerValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
    String dateOfBirthDay = String.valueOf(getRandomInt(1, 30)),
            dateOfBirthYear = String.valueOf(getRandomInt(1950, 2000)),
            dateOfBirthMonth = "May",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            phoneNumber = faker.phoneNumber().cellPhone(),
            address = faker.address().fullAddress();



    @Test
    void titledataAppear() {
        open("https://www.demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
    }

    @Test
    void dataAppear() {


        open("https://www.demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $x("//label[contains(text(),'Male')]").click();
        $x("//input[@id='userNumber']").setValue(phoneNumber);
        $x("//input[@id='dateOfBirthInput']").click();
        if (dateOfBirthDay.length() == 1) dateOfBirthDay = "0" + dateOfBirthDay;
        $x("//select[@class='react-datepicker__year-select']").selectOption(dateOfBirthYear);
        $x("//select[@class='react-datepicker__month-select']").selectOption(dateOfBirthMonth);
        $x("//div[contains(@class,'react-datepicker__day--0" + dateOfBirthDay + "')]").click();
        $x("//input[@id = 'subjectsInput']").setValue("Eng");
        $x("//*[text()='English']").click();
        $x("//div[contains(@class, 'custom-control-inline')]/label[text() = 'Music']").click();
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/1.jpg");
        $x("//div[@class='col-md-9 col-sm-12']/textarea").setValue(address);
        $x("//*[@id='react-select-3-input']").setValue("NC");
        $x("//*[text()='NCR']").click();
        $x("//*[@id='react-select-4-input']").setValue("De");
        $x("//*[text()='Delhi']").click();
        $x("//*[@id='submit']").click(); // Проверка формы
        $x("//td[(text()='Student Name')]").parent().shouldHave(text(firstName + " " + lastName));
        $x("//td[(text()='Student Email')]").parent().shouldHave(text(email));
        $x("//td[(text()='Gender')]").parent().shouldHave(text("Male"));
        $x("//td[(text()='Mobile')]").parent().shouldHave(text(phoneNumber));
        $x("//td[(text()='Date of Birth')]").parent().shouldHave(text(dateOfBirthDay + " " + dateOfBirthMonth + "," + dateOfBirthYear));
        $x("//td[(text()='Subjects')]").parent().shouldHave(text("English"));
        $x("//td[(text()='Hobbies')]").parent().shouldHave(text("Music"));
        $x("//td[(text()='Picture')]").parent().shouldHave(text("1.jpg"));
        $x("//td[(text()='Address')]").parent().shouldHave(text(address));
        $x("//td[(text()='State and City')]").parent().shouldHave(text("NCR" + " " + "Delhi"));

    }
}