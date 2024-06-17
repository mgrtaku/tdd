package com.example;

public class ClosedRange {
    int lowerEndpoint;
    int upperEndpoint;

    public ClosedRange(int lowerEndpoint, int upperEndpoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndpoint;
    }

    public int getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public int getUpperEndpoint() {
        return this.upperEndpoint;
    }

    @Override
    public String toString() {
        return "[" + this.lowerEndpoint + "," + this.upperEndpoint + "]";
    }

    public boolean contains(int num) {
        if (num >= lowerEndpoint && num <= upperEndpoint) {
            return true;
        }
        return false;
    }

    public boolean isIncluded(ClosedRange range) {
        if (range.getLowerEndpoint() >= lowerEndpoint && range.getUpperEndpoint() <= upperEndpoint) {
            return true;
        }
        return false;
    }
}
