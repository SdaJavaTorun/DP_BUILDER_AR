package com.dpBuilder;

public class Tesla2 extends Builder{
    @Override
    public void buildEngine() {
        carset.setEngine("T2engine");
    }

    @Override
    public void buildHood() {
        carset.setHood("T2hood");
    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("T2lakier");
    }

    @Override
    public void buildWheels() {
        carset.setWheels("T2koła");
    }

    @Override
    public void buildSeats() {
        carset.setSeats("T2seats");
    }
}
