package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static com.codeborne.selenide.Condition.text;

public class WikipediaSettingsTest extends BaseTest {
    @Test
    @DisplayName("Проверка добавления французского языка в настройках")
    @Description("Тест проверяет возможность добавления французского языка в настройках приложения")
    @Severity(SeverityLevel.MINOR)  
    @Story("Настройки языка")
    public void testAddFrenchLanguage() {
        new MainPage()
                .openMainPage()
                .openSettings()
                .addLanguage("Svenska")
                .verifyLanguageAdded("Svenska");
    }
}
