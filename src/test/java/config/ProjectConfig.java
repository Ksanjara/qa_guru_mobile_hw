package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:remote.properties"
})
public interface ProjectConfig extends Config {
    @Key("appUrl")
    String appUrl();

    @Key("project")
    String project();

    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("os")
    String os();

    @Key("deviceModel")
    String deviceModel();

    @Key("osVersion")
    String osVersion();
}
