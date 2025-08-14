package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.MainScreen;

@Epic("Wikipedia Mobile Tests")
@Feature("Главный экран Wikipedia")
public class WikipediaMainPageTest extends BaseTest {

    @Test
    @DisplayName("Проверка наличия раздела 'In the News' на главном экране")
    @Description("Тест проверяет наличие раздела новостей на главном экране")
    @Severity(SeverityLevel.NORMAL)
    @Story("Контент главного экрана")
    public void testInTheNewsSection() {
        new MainScreen()
                .openMainScreen()
                .verifyNewsSection();
    }
}
