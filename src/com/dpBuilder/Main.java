package com.dpBuilder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder tesla = new Tesla();
        Builder tesla2 = new Tesla2();
        Builder tesla3 = new Tesla3();

        director.setBuilder(tesla);
        director.build();
        Carset carset = director.getCarset();
        System.out.println(carset.toString());

        director.setBuilder(tesla2);
        director.build();
        Carset carset2 = director.getCarset();
        System.out.println(carset2.toString());

        director.setBuilder(tesla3);
        director.build();
        Carset carset3 = director.getCarset();
        System.out.println(carset3.toString());
    }
}
