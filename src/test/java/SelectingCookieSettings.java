import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

// запуск с SelectingCookieSettings
public class SelectingCookieSettings {
    @Test
    public void SelectingCookieSettingsPolytika(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        step("Принимаем Куки", () -> {
            $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        });
        step("Кликаем по ссылке в футере - Выбор настроек Cookie", () -> {
            $(".js-cookie-choice").click();
        });
        step("Кликаем по ссылке Политикой обработки файлов cookie ЗАО «ПАТИО»,", () -> {
            $(By.xpath("//a[@data-type='cookie-loyalty']")).click();
        });
    }

    @Test
    public void SelectingCookieSettingslist(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
       // step("Принимаем Куки", () -> {
       //     $("button[class='js-cookie-popup-close btn btn--block'] span").click();
       // });
        step("Кликаем по ссылке в футере - Выбор настроек Cookie", () -> {
            $(".js-cookie-choice").click();
        });
        step("Кликаем по ссылке списком файлов cookie,", () -> {
            $(By.xpath("//a[@data-type='cookie']")).click();
        });
    }
}
