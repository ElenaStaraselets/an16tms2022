package Lesson12HW;

import java.io.Serializable;

public class Engine implements Serializable {
    private String type;
    private transient int cylinderCount;

    public Engine(String type, int cylinderCount) {
        this.type = type;
        this.cylinderCount = cylinderCount;
    }

    public String getType() {
        return type;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", cylinderCount=" + cylinderCount +
                '}';
    }
}
