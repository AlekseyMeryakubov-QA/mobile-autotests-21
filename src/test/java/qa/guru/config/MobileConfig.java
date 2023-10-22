package qa.guru.config;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface MobileConfig extends Config {

    @Key("device")
    @DefaultValue("OnePlus 9")
    String getDevice();

    @Key("os_version")
    @DefaultValue("11.0")
    String getVersion();

    @Key("appUrl")
    String getApp();
}
