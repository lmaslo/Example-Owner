package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${device}.properties"
})
public interface MobileConfig extends Config {

    @Key("platformName")
    String platformName();

    @Key("platformVersion")
    String platformVersion();

    @Key("deviceName")
    String deviceName();

}
