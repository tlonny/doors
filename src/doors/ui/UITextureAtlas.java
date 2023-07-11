package doors.ui;

import doors.Doors;
import doors.core.graphics.texture.TextureSample;
import doors.core.utility.vector.Vector2in;

public class UITextureAtlas {

    private static Vector2in TILE_DIMENSIONS = new Vector2in(8, 8);

    public static TextureSample BACKGROUND = Doors.TEXTURE_UI.createTextureSample(new Vector2in(0, 0), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample TITLE_BAR = Doors.TEXTURE_UI.createTextureSample(new Vector2in(1, 0), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample HIGHLIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(2, 0), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample WINDOW_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(1, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample WINDOW_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(1, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample WINDOW_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(1, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample WINDOW_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(2, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample WINDOW_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(2, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample WINDOW_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(2, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample WINDOW_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(3, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample WINDOW_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(3, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample WINDOW_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(3, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_PRESSED_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(10, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_PRESSED_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(10, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_PRESSED_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(10, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_PRESSED_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(11, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_PRESSED_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(11, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_PRESSED_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(11, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_PRESSED_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(12, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_PRESSED_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(12, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_PRESSED_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(12, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_DISABLED_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(14, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_DISABLED_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(14, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_DISABLED_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(14, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_DISABLED_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(15, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_DISABLED_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(15, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_DISABLED_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(15, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BUTTON_DISABLED_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(16, 2), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_DISABLED_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(16, 3), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BUTTON_DISABLED_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(16, 4), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_BLUR_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_BLUR_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_BLUR_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_BLUR_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_BLUR_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_BLUR_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_BLUR_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_BLUR_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_BLUR_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_FOCUS_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(10, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_FOCUS_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(10, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_FOCUS_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(10, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_FOCUS_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(11, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_FOCUS_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(11, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_FOCUS_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(11, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_FOCUS_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(12, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_FOCUS_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(12, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_FOCUS_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(12, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_DISABLED_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(14, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_DISABLED_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(14, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_DISABLED_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(14, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_DISABLED_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(15, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_DISABLED_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(15, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_DISABLED_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(15, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample DIALOG_DISABLED_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(16, 6), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_DISABLED_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(16, 7), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample DIALOG_DISABLED_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(16, 8), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BORDER_TOP_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 10), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BORDER_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 11), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BORDER_BOTTOM_LEFT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(6, 12), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BORDER_TOP = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 10), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BORDER_CENTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 11), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BORDER_BOTTOM = Doors.TEXTURE_UI.createTextureSample(new Vector2in(7, 12), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample BORDER_TOP_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 10), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BORDER_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 11), Vector2in.ONE, TILE_DIMENSIONS);
    public static TextureSample BORDER_BOTTOM_RIGHT = Doors.TEXTURE_UI.createTextureSample(new Vector2in(8, 12), Vector2in.ONE, TILE_DIMENSIONS);

    public static TextureSample CURSOR_POINTER = Doors.TEXTURE_UI.createTextureSample(new Vector2in(1, 1), new Vector2in(2, 2), TILE_DIMENSIONS);
    public static TextureSample CURSOR_ARROW = Doors.TEXTURE_UI.createTextureSample(new Vector2in(1, 3), new Vector2in(2, 2), TILE_DIMENSIONS);
    public static TextureSample CURSOR_FORBIDDEN = Doors.TEXTURE_UI.createTextureSample(new Vector2in(3, 1), new Vector2in(2, 2), TILE_DIMENSIONS);
}
