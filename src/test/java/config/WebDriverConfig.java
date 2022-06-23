package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {


    @Key("baseUrl")
    @DefaultValue("https://github.com/")
    String getBaseUrl();


    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    //Зачитываем данные
    @Key("remoteUrl")
    //Обрабатываем дефолтные значений
    @DefaultValue("http://localhost:4444/wd/hb")
    //Конвертируем результат
    URL getRemoteUrl();
}
