package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${env}.properties", "classpath:config/browserstack.properties"})
public interface BrowserStackConfig extends Config {

    @Key("userName")
    String userName();

    @Key("accessKey")
    String accessKey();

    @Key("app")
    String app();

    @Key("deviceName")
    @DefaultValue("Google Pixel 6")
    String deviceName();

    @Key("platformName")
    @DefaultValue("Android")
    String platformName();

    @Key("platformVersion")
    @DefaultValue("13.0")
    String platformVersion();

    @Key("projectName")
    @DefaultValue("Wikipedia Mobile Tests")
    String projectName();

    @Key("buildName")
    @DefaultValue("wikipedia-mobile-tests-1.0")
    String buildName();

    @Key("sessionName")
    @DefaultValue("Wikipedia Main Page Test")
    String sessionName();

    @Key("remoteUrl")
    @DefaultValue("https://hub-cloud.browserstack.com/wd/hub")
    String remoteUrl();
}
