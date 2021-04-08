package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Find {

    @Test
    void firstFind() {

       open("https://github.com/selenide/selenide");
       $x("//ul[@class='list-style-none d-flex flex-wrap mb-n2']/li[1]").shouldBe(Condition.visible).hover();
       $x("//div[@class='Popover-message Popover-message--large Box color-shadow-large Popover-message--bottom-right']").shouldHave(Condition.text("Solntsev"));



        sleep(5000);
    }


}
