package model;

public class Coverage {
    private String type;
    private double maxValue;

    public Coverage(String type, double maxValue) {
        this.type = type;
        this.maxValue = maxValue;
    }

    public String getType() {
        return type;
    }

    public double getMaxValue() {
        return maxValue;
    }
}
