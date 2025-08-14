package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public abstract class BaseScreen {

    protected void waitForScreenLoad() {
        sleep(2000);
    }

    @Step("Кликнуть по элементу")
    protected void clickElement(SelenideElement element) {
        element.shouldBe(visible).click();
    }

    @Step("Ввести текст: {text}")
    protected void enterText(SelenideElement element, String text) {
        element.shouldBe(visible);
        element.getWrappedElement().clear();
        element.getWrappedElement().sendKeys(text);
    }

    @Step("Проверить видимость элемента")
    protected void verifyElementVisible(SelenideElement element) {
        element.shouldBe(visible);
    }
}

