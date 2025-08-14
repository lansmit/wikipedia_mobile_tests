package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class ArticleScreen extends BaseScreen {

    private final SelenideElement articleTitle = $(id("org.wikipedia.alpha:id/page_title"));
    private final SelenideElement backButton = $(id("org.wikipedia.alpha:id/nav_back"));
    private final ElementsCollection textViewResults = $$(className("android.widget.TextView"));

    @Step("Проверить открытие статьи с текстом: {expectedText}")
    public ArticleScreen verifyArticleOpened(String expectedText) {
        textViewResults.findBy(text(expectedText)).shouldBe(visible);
        return this;
    }

    @Step("Вернуться к результатам поиска")
    public SearchResultScreen goBackToResults() {
        clickElement(backButton);
        return new SearchResultScreen();
    }
}

