package doors;

import java.nio.file.Paths;

import doors.utility.vector.Vector2in;
import doors.utility.vector.Vector3fl;

public class Config {

    public static Vector2in RESOLUTION = new Vector2in(1280, 720).mul(1);
    public static Vector2in MAX_IMAGE_TEXTURE_DIMENSIONS = new Vector2in(1024, 1024);
    public static Vector3fl HYPERLINK_COLOR = Vector3fl.fromHex(0x0000FF);
    public static Vector3fl HYPERLINK_HOVER_COLOR = Vector3fl.fromHex(0xFF00FF);
    public static Vector3fl HYPERLINK_PRESSED_COLOR = Vector3fl.fromHex(0xFF0000);
    public static Vector2in GLYPH_CHUNK_DIMENSIONS = new Vector2in(8, 16);

    public static String WORKSPACE_PATH = Paths.get("levels/workspace").toString();
    public static String CACHE_PATH = Paths.get("levels/cache").toString();

}
