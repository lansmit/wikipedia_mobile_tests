package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultPage extends BasePage{

    // Локаторы для страница поиска результата
    private final ElementsCollection searchResult = $$(id("org.wikipedia.alpha:id/page_list_item_title"));
    private final SelenideElement backButton = $(id("org.wikipedia.alpha:id/nav_back"));
    private final ElementsCollection textViewResults = $$(className("android.widget.TextView"));

    @Step("Проверить наличие результатов поиска")
    public SearchResultPage verifySearchResults() {
        searchResult.first().shouldBe(visible);
        return this;
    }

    @Step("Кликнуть по первому результату")
    public ArticlePage clickFirstResult() {
        clickElement(searchResult.first());
        return new ArticlePage();
    }

    @Step("Вернуться назад")
    public MainPage goBack() {
        clickElement(backButton);
        return new MainPage();
    }

}
