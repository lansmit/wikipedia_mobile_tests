package screens;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.AppiumBy;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;
import io.qameta.allure.Step;

public class SettingsScreen extends BaseScreen {

    // Локаторы для экрана настроек
    private final SelenideElement languageSettings = $$(AppiumBy.className("android.widget.TextView")).findBy(text("Wikipedia language"));
    private final ElementsCollection textViewResults = $$(className("android.widget.TextView"));

    @Step("Добавить язык: {languageText}")
    public SettingsScreen addLanguage(String languageText) {
        clickElement(languageSettings);
        SelenideElement targetLanguage = textViewResults.findBy(text(languageText));
        clickElement(targetLanguage);
        return this;
    }

    @Step("Проверить наличие языка на экране настроек: {languageText}")
    public SettingsScreen verifyLanguageAdded(String languageText) {
        SelenideElement targetLanguage = textViewResults.findBy(text(languageText));
        targetLanguage.shouldBe(visible);
        return this;
    }
}
