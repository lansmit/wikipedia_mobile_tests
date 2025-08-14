package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.BrowserStackConfig;
import drivers.BrowserstackDriver;
import drivers.EmulatorDriver;
import helpers.AttachmentsUtils;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected BrowserStackConfig config = ConfigFactory.create(BrowserStackConfig.class);
    
    private static final String env = System.getProperty("env", "BROWSERSTACK").toUpperCase();

    @BeforeAll
    static void beforeAll() {
        switch (env) {
            case "BROWSERSTACK":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "EMULATOR":
                Configuration.browser = EmulatorDriver.class.getName();
                break;
            default:
                throw new IllegalArgumentException("Unsupported env: " + env);
        }
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        try {
            AndroidDriver driver = (AndroidDriver) WebDriverRunner.getWebDriver();

            AttachmentsUtils.attachScreenshot(driver);
            AttachmentsUtils.attachPageSource(driver);
            AttachmentsUtils.attachLogs("Test finished on device: " +
                    driver.getCapabilities().getCapability("deviceName"));

            String sessionId = Selenide.sessionId().toString();
            System.out.println(sessionId);
            AttachmentsUtils.attachVideoLink(sessionId);
        } catch (Exception e) {
            System.out.println("Не удалось добавить вложения: " + e.getMessage());
        } finally {
            closeWebDriver();
        }
    }
}
