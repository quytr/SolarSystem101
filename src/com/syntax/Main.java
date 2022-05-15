package com.syntax;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem FactorX = new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        // adding features to our sun
        FeatureSun XFact = new FeatureSun();
        XFact.color="green";
        XFact.radius="100000000000km";
        XFact.heat="43243125423kj";

    }
}
