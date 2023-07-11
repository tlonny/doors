package doors.state;

import doors.Doors;
import doors.core.config.Config;
import doors.core.io.Mouse;
import doors.core.ui.UIDocument;
import doors.core.utility.vector.Vector2in;
import doors.core.utility.vector.Vector3fl;
import doors.ui.UITextureAtlas;
import doors.ui.MainMenuExploreComponent;

public class MainMenuExploreGameState extends GameState {

    public static MainMenuExploreGameState MAIN_MENU_EXPLORE_GAME_STATE = new MainMenuExploreGameState();

    private UIDocument document;

    public MainMenuExploreGameState() {
        this.document = new UIDocument(new MainMenuExploreComponent());
    }

    @Override
    public void use() {
        super.use();
        Mouse.MOUSE.centerLock = false;
    }

    @Override
    public void update() {

        Doors.UI_QUAD_BATCH.writeQuad(
            UITextureAtlas.BACKGROUND,
            Vector2in.ZERO,
            Config.CONFIG.getResolution(),
            Vector3fl.WHITE
        );

        this.document.update(Doors.UI_QUAD_BATCH);

    }
}

