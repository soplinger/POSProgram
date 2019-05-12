package com.company;

public class Blizzards {

    public String bName;
    public String bSize;
    public double bPrice;

    public Blizzards(String bName, String bSize, double bPrice) {
        this.bName = bName;
        this.bSize = bSize;
        this.bPrice = bPrice;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbSize() {
        return bSize;
    }

    public void setbSize(String bSize) {
        this.bSize = bSize;
    }

    public double getbPrice() {
        return bPrice;
    }

    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }

    @Override
    public String toString() {
        return "Blizzards{" +
                "bName='" + bName + '\'' +
                '}';
    }
}
