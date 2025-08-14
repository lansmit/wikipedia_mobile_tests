package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.MainScreen;
import static com.codeborne.selenide.Condition.text;

public class WikipediaSettingsTest extends BaseTest {
    @Test
    @DisplayName("Проверка добавления шведского языка в настройках")
    @Description("Тест проверяет возможность добавления шведского языка в настройках приложения")
    @Severity(SeverityLevel.MINOR)  
    @Story("Настройки языка")
    public void testAddSwedishLanguage() {
        new MainScreen()
                .openMainScreen()
                .openSettings()
                .addLanguage("Svenska")
                .verifyLanguageAdded("Svenska");
    }
}
