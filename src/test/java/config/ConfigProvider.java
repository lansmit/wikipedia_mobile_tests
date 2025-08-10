package config;

import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {
    @Getter
    private static final BrowserStackConfig BrowserStackConfig =
            ConfigFactory.create(
                    BrowserStackConfig.class,
                    System.getProperties()
            );
}
