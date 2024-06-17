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

    public boolean contains(int i) {
        return false;
    }
}
