package doors.core.graphics.texture;

import doors.core.utility.vector.Vector2fl;
import doors.core.utility.vector.Vector2in;

public class TextureSample {

    public TextureChannel textureChannel;
    public Vector2fl[] textureOffsets;
    public Vector2in dimensions;

    public TextureSample(TextureChannel textureChannel, Vector2fl[] textureOffsets, Vector2in dimensions) {
        this.textureChannel = textureChannel;
        this.textureOffsets = textureOffsets;
        this.dimensions = dimensions;
    }

}

