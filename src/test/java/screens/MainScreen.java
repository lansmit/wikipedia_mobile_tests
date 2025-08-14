package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen extends BaseScreen {

    private final SelenideElement searchInput = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final SelenideElement menuButton = $(id("org.wikipedia.alpha:id/menu_overflow_button"));
    private final SelenideElement settingsButton = $(id("org.wikipedia.alpha:id/explore_overflow_settings"));
    private final SelenideElement newsSection = $x("//*[@text='In the news']");
    private final SelenideElement searchWikipedia = $(accessibilityId("Search Wikipedia"));

    @Step("Открыть главный экран")
    public MainScreen openMainScreen() {
        waitForScreenLoad();
        return this;
    }

    @Step("Проверить наличие раздела новостей")
    public MainScreen verifyNewsSection() {
        verifyElementVisible(newsSection);
        return this;
    }

    @Step("Выполнить поиск: {searchQuery}")
    public SearchResultScreen performSearch(String searchQuery) {
        clickElement(searchWikipedia);
        waitForScreenLoad();
        enterText(searchInput, searchQuery);
        return new SearchResultScreen();
    }

    @Step("Открыть настройки")
    public SettingsScreen openSettings() {
        clickElement(menuButton);
        clickElement(settingsButton);
        return new SettingsScreen();
    }
}

