package doors.graphics;

import java.nio.ByteBuffer;
import java.nio.file.Path;

import org.joml.Vector2f;
import org.joml.Vector2i;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import doors.utility.IO;
import doors.utility.Maths;

public class Texture {

    private static Vector2i MAX_DIMENSIONS = new Vector2i(1024, 1024);
    private static ByteBuffer BYTE_BUFFER = ByteBuffer.allocateDirect(MAX_DIMENSIONS.x * MAX_DIMENSIONS.y * 4);

    private Vector2i dimensions;
    public int textureID;

    public Texture(Vector2i dimensions) {
        this.dimensions = dimensions;
    }

    public void setup() {
        this.textureID = GL20.glGenTextures();
        GL20.glBindTexture(GL11.GL_TEXTURE_2D, this.textureID);
        GL20.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, this.dimensions.x, this.dimensions.y, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer)null);
        GL20.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL20.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
    }

    public void loadTextureDataFromFile(Path path) {
        BYTE_BUFFER.clear();
        IO.loadImageToBuffer(path, BYTE_BUFFER);
        BYTE_BUFFER.flip();
        this.bind();
        GL20.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, this.dimensions.x, this.dimensions.y, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, BYTE_BUFFER);
    }


    public void bind() {
        GL20.glBindTexture(GL11.GL_TEXTURE_2D, this.textureID);
    }

    public TextureSample createTextureSample(Vector2i position, Vector2i dimensions) {
        return new TextureSample(
            Maths.div(new Vector2f(position), this.dimensions),
            Maths.div(new Vector2f(position).add(0, dimensions.y), this.dimensions),
            Maths.div(new Vector2f(position).add(dimensions.x, dimensions.y), this.dimensions),
            Maths.div(new Vector2f(position).add(dimensions.x, 0), this.dimensions)
        );
    }

}
