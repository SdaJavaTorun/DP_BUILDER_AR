package com.dpBuilder;

abstract class Builder {

    protected Carset carset;

    public void newCar () {
        carset = new Carset();
    }

    public Carset getCarset () {
        return carset;
    }

    public abstract void buildEngine();
    public abstract void buildHood();
    public abstract void buildLacquer();
    public abstract void buildWheels();
    public abstract void buildSeats();
}