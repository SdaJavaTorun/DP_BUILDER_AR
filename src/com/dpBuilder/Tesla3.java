package com.dpBuilder;

public class Tesla3 extends Builder {
    @Override
    public void buildEngine() {
        carset.setEngine("T3engine");
    }

    @Override
    public void buildHood() {
        carset.setHood("T3hood");
    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("T3lakier");
    }

    @Override
    public void buildWheels() {
        carset.setWheels("T3wheels");
    }

    @Override
    public void buildSeats() {
        carset.setSeats("T3seats");
    }
}
