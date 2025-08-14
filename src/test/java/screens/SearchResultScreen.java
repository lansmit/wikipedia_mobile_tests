package screens;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultScreen extends BaseScreen {

    private final ElementsCollection searchResult = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Проверить наличие результатов поиска")
    public SearchResultScreen verifySearchResults() {
        searchResult.first().shouldBe(visible);
        return this;
    }

    @Step("Кликнуть по первому результату")
    public ArticleScreen clickFirstResult() {
        clickElement(searchResult.first());
        return new ArticleScreen();
    }
}
