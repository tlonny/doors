package doors.level;

import doors.utility.CubeFace;
import doors.utility.vector.Vector3fl;

public class Door {

    public String name;
    public String targetLevel;
    public String targetDoor;
    public Vector3fl position;
    public CubeFace orientation;

    public Door(String name, String targetTerrain, String targetDoor, Vector3fl position, CubeFace orientation) {
        this.name = name;
        this.targetLevel = targetTerrain;
        this.targetDoor = targetDoor;
        this.position = position;
        this.orientation = orientation;
    }

    public Door(String name, Vector3fl position, CubeFace orientation) {
        this(name, null, null, position, orientation);
    }

    public void setName(String name) {
        this.name = name;
    }
}
