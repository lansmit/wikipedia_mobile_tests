package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Epic("Wikipedia Mobile Tests")
@Feature("Главная страница Wikipedia")
public class WikipediaMainPageTest extends BaseTest {

    @Test
    @DisplayName("Проверка наличия раздела 'In the News' на главной странице")
    @Description("Тест проверяет наличие раздела новостей на главной странице")
    @Severity(SeverityLevel.NORMAL)
    @Story("Контент главной страницы")
    public void testInTheNewsSection() {
        new MainPage()
                .openMainPage()
                .verifyNewsSection();
    }
}
