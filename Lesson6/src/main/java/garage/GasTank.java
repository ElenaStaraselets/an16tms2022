package garage;

public class GasTank {
    private float maxCapacity;
    private float currentLevel;

    public GasTank(float maxCapacity, float currentLevel) {
        this.maxCapacity = maxCapacity;
        this.currentLevel = currentLevel;
    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public float getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(float currentLevel) {
        if(currentLevel>maxCapacity)
            this.currentLevel = maxCapacity;
        else
            this.currentLevel = currentLevel;
    }
}
