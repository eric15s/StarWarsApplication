package com.company;

import java.util.LinkedList;

class UnitTests {
    public static void main(String[] args) {
        testVehiclesConstructor();

        System.out.println("");

        testGroundFighter();

        System.out.println("");

        testStarfighter();




    }
    public static void testVehiclesConstructor(){
        Vehicles test = new Vehicles("X-Wing", "Age of the Rebellion, Resistance, and Republic");
        if(test.getEra().equals("Age of the Rebellion, Resistance, and Republic")){
            System.out.println(test.getName() + " Vehicle from the " + test.getEra() + " has been added");
        } else {
            System.out.println("Vehicle has not been added");
        }

        System.out.println("");

        Vehicles test2 = new Vehicles();
        test2.isHero("F");


    }

    public static void testGroundFighter(){
        Groundfighter test3 = new Groundfighter("AT-M6", "Age of the Resistance", "Walker");
        test3.lightSide("n");

    }
    public static void testStarfighter(){
        Starfighter test4 = new Starfighter();
        test4.isHero("y");

    }


}
