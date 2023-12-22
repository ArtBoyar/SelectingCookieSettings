import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class HeaderTelNumbers {
    @Test
    public void successfulNumbersTest() {

        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        step("Принимаем Куки", () -> {
            $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        });
        step("Кликаем на выпадающий список", () -> {
            $("div[class='h-controls'] div[class='h-drop__head js-drop-select-trigger']").click();
        });
        step("Проверяем отображение телефонов и email", () -> {
            $("div[class='h-drop h-phone js-drop-select active'] ul[class='h-drop__list']").shouldHave(text(" (29) 5-700-700")).shouldHave(text(" (17) 359-59-59")).shouldHave(text(" (44) 5-700-700")).shouldHave(text(" (25) 6-700-700")).shouldHave(text(" 275@5element.by"));
        });

    }
}
        /*@Test
        public void IphoneSE () {
            Configuration.holdBrowserOpen = true;
            Configuration.browserSize = "350x700";
            System.setProperty("chromeoptions.mobileEmulation", "deviceName=iPhone SE");
            SelenideLogger.addListener("allure", new AllureSelenide());
            step("Открываем главную страницу", () -> {
                open("https://stage.5el.by/");
            });
            step("Принимаем Куки", () -> {
                $("button[class='js-cookie-popup-close btn btn--block'] span").click();
            });
            step("Кликаем на выпадающий список", () -> {
                $("h-controls-item ic-phone").click();
            });
            step("Проверяем отображение телефонов и email", () -> {
                $(".phones-list").shouldHave(text(" (29) 5-700-700")).shouldHave(text(" (17) 359-59-59")).shouldHave(text(" (44) 5-700-700")).shouldHave(text(" (25) 6-700-700")).shouldHave(text(" 275@5element.by"));
            });

        }

}

         */

