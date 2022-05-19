package com.syntax;

public class Main {

    public static void main(String[] args) {
        // write your code here

        SolarSystem FactorX = new SolarSystem();
        FactorX.Sun = "1";
        FactorX.Moon = "4";
        FactorX.Planet = "2";
        FactorX.Stars = "10000";

        // adding features to our sun
        FeatureSun XFact = new FeatureSun();
        XFact.color = "green";
        XFact.radius = "100000000000km";
        XFact.heat = "43243125423kj";

        // adding the features for star in the solar system
        FeatureStars FacX = new FeatureStars();
        FacX.color = "green";
        FacX.radius = "3242y563463km";
        FacX.size = "9999999999m";

        // adding the features for Planet2
        Planet2 Ironman = new Planet2();
        Ironman.name = "Avenger";
        Ironman.size = "9452423y523452km";
        Ironman.color = "red";
    }
}
