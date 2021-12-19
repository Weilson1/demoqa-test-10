package mail.ru.galyavievai;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    //@BeforeAll
    //static void beforeAll() {
    //   Configuration.browserSize = "1920x1080";
    // }
    @Test
    void successTest () {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Jhon Shepard");
        $("#userEmail").setValue("email@email.com");
        $("#currentAddress").setValue("Current Address");
        $("#permanentAddress").setValue("Another Address");
        $("#submit").scrollTo().click();

        $("#output").shouldBe(visible);
        $("#name").shouldHave(text("Jhon Shepard"));
        $("#email").shouldHave(text("email@email.com"));
        $("#output #currentAddress").shouldHave(text("Current Address"));
        $("#output #permanentAddress").shouldHave(text("Another Address"));


    }

}
