package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class dragAndDropTest {

    @Test

    void shoulddragAtoB(){


  //  open("https://the-internet.herokuapp.com/drag_and_drop");
  //  $x("//*[@id='column-a']").shouldHave(text("A"));
  //  $x("//*[@id='column-b']").shouldHave(text("B"));

   // actions().moveToElement($x("//*[@id='column-a']")).clickAndHold().moveToElement($x("//*[@id='column-b']")).release().perform();

  //  actions().clickAndHold($x("//*[@id='column-a']"));

   //     actions().clickAndHold($x("//*[@id='column-a']")).moveByOffset(200,0);
        //$x("//*[@id='column-b']").hover().click();


 //   actions().moveToElement($x("//*[@id='column-b']")).release().perform();



    // $x("//*[@id='column-a']").dragAndDropTo($x("//*[@id='column-b']"));
    //  $("#column-a").dragAndDropTo("#column-b");


  //  Selenide.sleep(5000);

 //   $x("//*[@id='column-a']").shouldHave(text("B"));
 //   $x("//*[@id='column-b']").shouldHave(text("A"));


    }


    @Test
    void shouldjunit(){
    open("https://github.com/selenide/selenide");
    $x("//*[@data-content='Wiki']").click();
    $x("//div[@class=' js-wiki-sidebar-toggle-display']").shouldHave(text("SoftAssertions"));
    $x("//*[@id='wiki-pages-box']/div/div[2]/ul/li[15]/strong/a").click();
    $x("//div[@class='markdown-body']").shouldHave(text("Using JUnit5 extend test class:"));

        Selenide.sleep(3000);

    }



}
