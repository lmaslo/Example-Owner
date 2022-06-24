import config.AndroidConfig;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    @Test
    public void testAndroidProperties() {

        System.setProperty("device","pixel");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());


        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("27.0");
        assertThat(config.deviceName()).isEqualTo("Pixel");
    }


    @Test
    public void testIOSProperties() {

        System.setProperty("device","iphone12");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());


        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("14.0");
        assertThat(config.deviceName()).isEqualTo("IPhone 12");
    }


}
