package dreamlink.utility;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CommonPaths {

    private static final String projectName = "dreamlink";

    public static final CommonPaths instance = new CommonPaths();

    public final Path configPath;
    public final Path dataPath;
    public final Path cachePath;

    public final Path cachedRemoteRoomsPath;
    public final Path localRoomsPath;
    public final Path localPacksPath;

    public CommonPaths() {
        var env = System.getenv();

        var defaultConfig = String.format("%s/.config", System.getProperty("user.home"));
        this.configPath = Paths.get(
            env.getOrDefault("XDG_CONFIG_HOME", defaultConfig), 
            CommonPaths.projectName
        );

        var defaultData = String.format("%s/.local/share", System.getProperty("user.home"));
        this.dataPath = Paths.get(
            env.getOrDefault("XDG_DATA_HOME", defaultData), 
            CommonPaths.projectName
        ); 

        var cachePath = String.format("%s/.cache", System.getProperty("user.home"));
        this.cachePath = Paths.get(
            env.getOrDefault("XDG_CACHE_HOME", cachePath), 
            projectName
        );

        this.localRoomsPath = this.dataPath.resolve("rooms");
        this.localPacksPath = this.dataPath.resolve("packs");
        this.cachedRemoteRoomsPath = this.cachePath.resolve("rooms");
    }
    
}
