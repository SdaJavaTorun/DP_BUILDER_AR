package com.dpBuilder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder tesla = new Tesla();
        Builder tesla2 = new Tesla2();
        Builder tesla3 = new Tesla3();

        director.setBuilder(tesla);
        director.setBuilder(tesla2);
        director.setBuilder(tesla3);

        director.build();

        Carset carset = director.getCarset();

        carset.toString();

    }
}
