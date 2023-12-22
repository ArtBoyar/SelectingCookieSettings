import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class CheckLogoBrand {
    @Test
    public void LogoMainPageBeko() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        step("Принимаем Куки", () -> {
            $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        });
        step("Проверяем отображение лого бренда Beko", () -> {
            $(By.xpath("//img[@title='BEKO']")).shouldHave(Condition.attribute("data-src", "/upload/uf/8db/8dbb39785f49ddeeb4f9167971050a82.svg"));
        });
    }
    @Test
    public void LogoMainPageTcl() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        // step("Принимаем Куки", () -> {
          //  $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        //});
        step("Проверяем отображение лого бренда TCL", () -> {
            $(By.xpath("//img[@title='TCL']")).shouldHave(Condition.attribute("data-src", "/upload/uf/90a/90a0378e0c7dbaa58eb152936546814d.jpg"));
        });
    }
    @Test
    public void LogoMainPageXiaomi() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        //step("Принимаем Куки", () -> {
          //  $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        //});
        step("Проверяем отображение лого бренда Xiaomi", () -> {
            $(By.xpath("//img[@title='XIAOMI']")).shouldHave(Condition.attribute("data-src", "/upload/uf/3b6/3b6208073f3b6e66a96e4f9174c0684d.jpg"));
        });
    }
    @Test
    public void LogoMainPageLG() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        //step("Принимаем Куки", () -> {
          //  $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        //});
        step("Проверяем отображение лого бренда LG", () -> {
            $(By.xpath("//img[@title='LG']")).shouldHave(Condition.attribute("data-src", "/upload/uf/2ee/2ee4c04e8bd0fbfd18c2a46409203c55.jpg"));
        });
    }
    @Test
    public void LogoMainPageHaier() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        //step("Принимаем Куки", () -> {
          //  $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        //});
        step("Проверяем отображение лого бренда HAIER", () -> {
            $(By.xpath("//img[@title='HAIER']")).shouldHave(Condition.attribute("data-src", "/upload/uf/2a9/2a9d57db88137bb03a0fcd1bd4385736.jpg"));
        });
    }
    @Test
    public void LogoMainPageSamsung() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://stage.5el.by/");
        });
        //step("Принимаем Куки", () -> {
          //  $("button[class='js-cookie-popup-close btn btn--block'] span").click();
        //});
        step("Проверяем отображение лого бренда Samsumg", () -> {
            $(By.xpath("//img[@title='SAMSUNG']")).shouldHave(Condition.attribute("data-src", "/upload/uf/172/172b75b774217c5b57c2cece9ae14f6d.jpg"));
        });
    }
}
