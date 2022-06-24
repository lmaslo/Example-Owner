package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:pixel.properties"
})
public interface AndroidConfig extends Config {

    @Key("platformName")
    String platformName();

    @Key("platformVersion")
    String platformVersion();

    @Key("deviceName")
    String deviceName();

}
