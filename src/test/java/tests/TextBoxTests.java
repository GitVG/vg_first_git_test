package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @Test
    void titledataAppear() {
        open("https://www.demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
    }

    @Test
    void dataAppear()
    {
        String dateOfBirthDay = "6",
                dateOfBirthMonth = "July",
                firstName = "Billy",
                lastName = "Willy",
                dateOfBirthYear = "1988";

        open("https://www.demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue("WB@mail.ru");
        $(By.xpath("//label[contains(text(),'Male')]")).click();
        $(By.xpath("//div[@class='col-md-9 col-sm-12']/input[@id='userNumber']")).setValue("1234567890");

      /*$(By.xpath("//div[@class='react-datepicker__input-container']/input")).click();
        $(By.xpath("//div[@class ='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']/select[@class='react-datepicker__month-select']/option[6]")).click();
        $(By.xpath("//div[@class ='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']/select[@class='react-datepicker__year-select']/option[123]")).click();
        $(By.xpath("//div[@class ='react-datepicker__day react-datepicker__day--015']")).click();
      */

        $x("//input[@id='dateOfBirthInput']").click();
        if (dateOfBirthDay.length() == 1) dateOfBirthDay = "0" + dateOfBirthDay;
        $x("//select[@class='react-datepicker__year-select']").selectOption(dateOfBirthYear);
        $x("//select[@class='react-datepicker__month-select']").selectOption(dateOfBirthMonth);
        $x("//div[contains(@class,'react-datepicker__day--0"+dateOfBirthDay+"')]").click();
        $x("//input[@id = 'subjectsInput']").setValue("Eng");
        $x("//*[text()='English']").click();
        $(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/label[contains(text(), 'Music')]")).click();
      //  $(By.xpath("//div[@class='form-file']/input")).sendKeys("C:\\Users\\Владимир Горбунов\\OneDrive - ООО АЙФЭЛЛ\\Рисунки\\Saved Pictures\\1.jpg");
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/1.jpg");
        $(By.xpath("//div[@class='col-md-9 col-sm-12']/textarea")).setValue("Lorem Ipsum");
        $x("//*[@id='react-select-3-input']").setValue("NC");
        $x("//*[text()='NCR']").click();
        $x("//*[@id='react-select-4-input']").setValue("De");
        $x("//*[text()='Delhi']").click();
        $("#submit").click();
        $x("//td[(text()='Student Name')]").parent().shouldHave(text(firstName + " " + lastName));
       // $x("//div[@class='table-responsive']").shouldHave(text("Billy"+"Willy"));





        sleep(5000);





    }




}