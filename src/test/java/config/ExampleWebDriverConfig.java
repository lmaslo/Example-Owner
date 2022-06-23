package config;

import java.util.Objects;

public class ExampleWebDriverConfig {

    public Browser getBrowser() {
        //Зачитываем данные из командной строки
        String browser = System.getProperty("browser");
        //Обрабатываем дефолтное значение
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        //Конвертируем в возращаемый тип
        return Browser.valueOf(browser);
    }

    public String getBaseUrl() {
        //Зачитываем данные из командной строки
        String baseUrl = System.getProperty("baseUrl");
        //Обрабатываем дефолтное значение
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com/";
        }
        //Конвертируем в возращаемый тип
        return baseUrl;
    }


}
