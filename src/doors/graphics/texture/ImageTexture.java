package doors.graphics.texture;

import java.nio.ByteBuffer;

import org.lwjgl.opengl.GL42;

import doors.Config;
import doors.utility.FileIO;
import doors.utility.vector.Vector2in;

public class ImageTexture extends AbstractTexture {

    private static int BYTE_BUFFER_BYTES = Config.MAX_IMAGE_TEXTURE_DIMENSIONS.getIntArea() * 4;
    private static ByteBuffer BYTE_BUFFER = ByteBuffer.allocateDirect(BYTE_BUFFER_BYTES);

    private String path;

    public ImageTexture(AbstractTextureChannel textureChannel, Vector2in dimensions, String path) {
        super(textureChannel, dimensions);
        this.path = path;
    }

    protected void loadTextureData() {
        BYTE_BUFFER.clear();
        FileIO.writeImageToBuffer(path, BYTE_BUFFER, true);
        BYTE_BUFFER.flip();
        GL42.glTexImage2D(
            GL42.GL_TEXTURE_2D, 
            0, 
            GL42.GL_RGBA, 
            this.dimensions.x, 
            this.dimensions.y, 
            0, 
            GL42.GL_RGBA, 
            GL42.GL_UNSIGNED_BYTE, 
            BYTE_BUFFER
        );
    }
}
