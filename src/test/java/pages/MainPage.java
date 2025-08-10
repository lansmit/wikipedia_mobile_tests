package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;

public class MainPage extends BasePage {
    // Локаторы для главной страницы
    private final SelenideElement searchField = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final SelenideElement menuButton = $(id("org.wikipedia.alpha:id/menu_overflow_button"));
    private final SelenideElement settingsButton = $(id("org.wikipedia.alpha:id/explore_overflow_settings"));
    private final SelenideElement newsSection = $x("//*[@text='In the news']");
    private final SelenideElement searchWikipedia = $(accessibilityId("Search Wikipedia"));

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        waitForPageLoad();
        return this;
    }

    @Step("Выполнить поиск: {searchQuery}")
    public SearchResultPage performSearch(String searchQuery) {
        clickElement(searchWikipedia);
        waitForPageLoad();
        searchField.shouldBe(visible);
        searchField.getWrappedElement().clear();
        searchField.getWrappedElement().sendKeys(searchQuery);
        return new SearchResultPage();
    }

    @Step("Открыть меню")
    public MainPage openMenu() {
        clickElement(menuButton);
        return this;
    }

    @Step("Перейти в настройки")
    public SettingsPage openSettings() {
        openMenu();
        clickElement(settingsButton);
        return new SettingsPage();
    }

    @Step("Проверить наличие раздела 'In the News'")
    public MainPage verifyNewsSection() {
        verifyElementVisible(newsSection);
        return this;
    }
}
