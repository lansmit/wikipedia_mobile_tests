package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class WikipediaSearchTest extends BaseTest {
    @Test
    @DisplayName("Проверка получения результата поиска")
    @Description("Тест проверяет возможность выполнения поиска и получения результатов")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Поиск статей")
    public void testSearchFunctionality() {
        new MainPage()
                .openMainPage()
                .performSearch("Java programming")
                .verifySearchResults();
    }

    @Test
    @DisplayName("Проверка открытия статьи")
    @Description("Тест проверяет возможность открытия статьи из результатов поиска")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Чтение статей")
    public void testArticleOpening() {
        String searchQuery = "Android";
        new MainPage()
                .openMainPage()
                .performSearch(searchQuery)
                .verifySearchResults()
                .clickFirstResult()
                .verifyArticleOpened(searchQuery);
    }
}
