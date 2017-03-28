package com.dpBuilder;

public class Tesla extends Builder {  // car1 lub car2
    @Override
    public void buildEngine() {
        carset.setEngine("Engine1");
    }

    @Override
    public void buildHood() {
        carset.setHood("hood2");
    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("Metalic");
    }

    @Override
    public void buildWheels() {
        carset.setWheels("cztery");
    }

    @Override
    public void buildSeats() {
        carset.setSeats("Skóra");
    }

}
